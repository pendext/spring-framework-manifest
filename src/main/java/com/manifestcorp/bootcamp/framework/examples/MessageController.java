package com.manifestcorp.bootcamp.framework.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/index")
    public String renderIndex(Model model) {
        model.addAttribute("message", "Hello!???");
        return "index";
    }

}
