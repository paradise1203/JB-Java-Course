package org.jblab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author aleksandrpliskin on 17.02.17.
 */
@Controller
public class IndexController {

    @RequestMapping(name = "/index", method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }

}
