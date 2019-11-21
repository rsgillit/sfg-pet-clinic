package com.gill.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index","index.html"})
    public String index(){

        return "index";
    }

    @ResponseBody
    @RequestMapping({"/oups"})
    public String oupsHandler(){
        return "not done yet";
    }
}
