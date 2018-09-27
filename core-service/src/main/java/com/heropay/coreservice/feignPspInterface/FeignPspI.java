package com.heropay.coreservice.feignPspInterface;

import com.heropay.coreservice.model.PspModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@FeignClient("psp-service")
public interface FeignPspI {

    @RequestMapping(method = RequestMethod.POST, value = "/models/getModel")
    Collection<PspModel> getPspModel(@RequestBody PspModel model);
}
