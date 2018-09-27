package com.heropay.pspservice;

import com.heropay.pspservice.model.PspModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/models")
public class RestPspModels {

    @RequestMapping(value = "/getModel", method = RequestMethod.POST)
    @ResponseBody
    Collection<PspModel> getPspModel(@RequestBody PspModel model) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("modelName" + model.getName());
        Collection<PspModel> pspModels = new ArrayList<>();
        pspModels.add(new PspModel("firstUserName", "firstUserPassword"));
        return pspModels;
    }
}
