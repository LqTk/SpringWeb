package com.webcontrol.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap modelMap){
        System.out.println("testtesttestsetstae...............");
        modelMap.addAttribute("message","hello spring mapping");
        return "hello";
    }
}
