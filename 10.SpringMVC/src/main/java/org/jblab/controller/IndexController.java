package org.jblab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author aleksandrpliskin on 17.02.17.
 */
@Controller
public class IndexController {

    Collection collection;

    @RequestMapping(value = "/index/{name}", method = RequestMethod.GET)
    public String getIndexPage(@PathVariable(value = "name") String name, Model model) {
        model.addAttribute("name", name);







        return "index";
    }

}
