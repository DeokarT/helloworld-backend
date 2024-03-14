package com.design.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {

    @RequestMapping("/")
    public String index() {
        return "Congratulations from DemoApplicationController.java";
    }
}