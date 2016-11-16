package org.jblab;

import org.jblab.dao.UserDAO;

import java.sql.SQLException;

/**
 * @author Aidar Shaifutdinov.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.getAll());
    }
}
