package com.heropay.coreservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestCoreTemplate {

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

    @GetMapping()
    public String message() {
        return "Hello From CoreRest -> " + user + " | " + password;
    }
}
