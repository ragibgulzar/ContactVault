package com.contactvault.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("Home Page Handler");
        return "home";
    }
}
