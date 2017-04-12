package org.jblab.service;

import org.jblab.model.User;
import org.jblab.util.json.Token;
import org.jblab.util.json.VkUser;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public interface UserService {

    User add(Token token, VkUser vkUser);

    List<User> getAll();

}
