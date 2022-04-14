package com.example.helloProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping (value = "/html")
    public static String home(){
        return "index";
    }
    @RequestMapping (value = "/form")
    public static String form(){
        return "form";
    }


}
