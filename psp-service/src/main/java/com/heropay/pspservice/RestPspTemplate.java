package com.heropay.pspservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestPspTemplate {
    @GetMapping()
    public String message() {
        return "Hello From PspRest";
    }
}
