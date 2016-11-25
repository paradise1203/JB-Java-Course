package org.jblab;

import org.jblab.dao.CommunityDAO;

import java.sql.SQLException;

/**
 * @author Aidar Shaifutdinov.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        int commId = Integer.valueOf(args[0]);
        CommunityDAO communityDAO = new CommunityDAO();
        communityDAO.delete(commId);
    }
}
