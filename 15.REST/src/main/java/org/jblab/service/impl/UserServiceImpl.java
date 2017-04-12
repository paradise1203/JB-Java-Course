package org.jblab.service.impl;

import org.jblab.model.User;
import org.jblab.repository.UserRepository;
import org.jblab.service.UserService;
import org.jblab.util.json.Token;
import org.jblab.util.json.VkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(Token token, VkUser vkUser) {
        User user = new User();
        user.setSocialId(vkUser.getId());
        user.setFirstName(vkUser.getFirstName());
        user.setLastName(vkUser.getLastName());
        VkUser.City city = vkUser.getCity();
        user.setCity(city != null ? city.getTitle() : null);
        user.setToken(token.getToken());
        userRepository.save(user);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
