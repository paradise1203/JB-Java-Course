package org.jblab.dao;

import org.jblab.entity.User;
import org.jblab.enums.Sex;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Aidar Shaifutdinov.
 */
public class UserDAO {

    private static Connection conn;

    static {
        String url = null;
        String username = null;
        String password = null;

        // read db properties
        try (InputStream in = UserDAO.class
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
        } catch (SQLException ex) {
            exit(ex, "Failed to get connection to the db!");
        }
    }

    private static void exit(Exception e, String msg) {
        System.out.println(msg);
        e.printStackTrace();
        System.exit(1);
    }

    public List<User> getAll() throws SQLException {
        List<User> users = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement("select * from users");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getLong(1));
            user.setName(rs.getString(2));
            user.setPassword(rs.getString(3));
            user.setSex(Sex.valueOf(rs.getString(4)));
            users.add(user);
        }
        return users;
    }

}
