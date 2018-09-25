package com.heropay.coreservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestCoreTemplate {

    @GetMapping()
    public String message() {
        return "Hello From CoreRest";
    }
}
