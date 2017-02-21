package org.jblab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aidar Shaifutdinov.
 */
@Controller
public class MainController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}
