package org.jblab.service;

import org.jblab.model.User;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public interface UserService {

    void add(User user);

    List<User> getAll();

}
