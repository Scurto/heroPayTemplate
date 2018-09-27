package com.heropay.coreservice;

import com.heropay.coreservice.feignPspInterface.FeignPspI;
import com.heropay.coreservice.model.PspModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/rest")
public class RestCoreTemplate {

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

    @Autowired
    private FeignPspI feignPspI;

    @GetMapping()
    public String message() {
        Collection<PspModel> pspModel = feignPspI.getPspModel(new PspModel("1", "2"));
        for (PspModel model : pspModel) {
            System.out.println(model);
        }
        return "Hello From CoreRest -> " + user + " | " + password;
    }
}
