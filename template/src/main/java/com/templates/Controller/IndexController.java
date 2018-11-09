package com.templates.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {


    @RequestMapping("")
    public String home() {
        System.out.println("hiome");
        return "index";
    }
}
