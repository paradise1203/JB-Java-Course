package org.jblab.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Aidar Shaifutdinov.
 */
public class CommunityDAO {

    private static Connection conn;

    static {
        String url = null;
        String username = null;
        String password = null;

        // read db properties
        try (InputStream in = CommunityDAO.class
                .getClassLoader().getResourceAsStream("persistence.properties")) {
            Properties properties = new Properties();
            properties.load(in);
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException ex) {
            exit(ex, "Failed to load properties!");
        }

        // acquire db connection
        try {
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
        } catch (SQLException ex) {
            exit(ex, "Failed to get connection to the db!");
        }
    }

    private static void exit(Exception e, String msg) {
        System.out.println(msg);
        e.printStackTrace();
        System.exit(1);
    }

    public void delete(int id) {
        try {
            update("DELETE FROM news n WHERE n.community_id = ?", id);
            update("DELETE FROM community c WHERE c.id = ?", id);
            update("DELETE FROM user_community u_c WHERE u_c.community_id = ?", id);
            conn.commit();
            System.out.println("Successful transaction :)");
        } catch (SQLException e) {
            try {
                conn.rollback();
                System.out.println("Failed transaction :(");
            } catch (SQLException ignored) {
            }
        }
    }

    private void update(String sql, int userId) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, userId);
        stmt.executeUpdate();
    }

}
