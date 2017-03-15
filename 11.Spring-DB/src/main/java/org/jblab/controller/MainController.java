package org.jblab.controller;

import org.jblab.model.User;
import org.jblab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Aidar Shaifutdinov.
 */
@Controller
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/home")
    @ResponseBody
    public User home() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
