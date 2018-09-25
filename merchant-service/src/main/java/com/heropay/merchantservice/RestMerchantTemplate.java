package com.heropay.merchantservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestMerchantTemplate {

    @GetMapping()
    public String message() {
        return "Hello From MerchantRest";
    }
}
