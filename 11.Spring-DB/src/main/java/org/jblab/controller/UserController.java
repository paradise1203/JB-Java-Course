package org.jblab.controller;

import org.jblab.model.User;
import org.jblab.model.enums.Sex;
import org.jblab.service.UserService;
import org.jblab.util.UserForm;
import org.jblab.util.UserFormToUserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.function.Function;

/**
 * @author Aidar Shaifutdinov.
 */
@Controller
public class UserController {

    private final UserService userService;
    private final Function<UserForm, User> transformer;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        transformer = new UserFormToUserTransformer();
    }

    @RequestMapping("/sign_up")
    public String getSignUp(Model model) {
        model.addAttribute("user", new UserForm());
        model.addAttribute("sex", Sex.values());
        return "sign_up";
    }

    @RequestMapping(value = "/sign_up", method = RequestMethod.POST)
    public String signUp(@ModelAttribute("user") @Valid UserForm userForm,
                         BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("sex", Sex.values());
            return "sign_up";
        }
        userService.add(transformer.apply(userForm));
        return "redirect:/home";
    }

}
