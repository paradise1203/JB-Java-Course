package org.jblab.controller;

import org.jblab.service.UserService;
import org.jblab.service.VkService;
import org.jblab.util.json.Token;
import org.jblab.util.json.VkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Aidar Shaifutdinov.
 */
@Controller
public class AuthController {

    private final UserService userService;
    private final VkService vkService;

    @Autowired
    public AuthController(UserService userService, VkService vkService) {
        this.userService = userService;
        this.vkService = vkService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("url", vkService.getAuthUrl());
        return "home";
    }

    @RequestMapping("/callback")
    public String callback(@RequestParam(value = "code", required = false) String code) {
        Token token = vkService.getToken(code);
        VkUser vkUser = vkService.getUser(token);
        userService.add(token, vkUser);
        return "redirect:/users";
    }

}
