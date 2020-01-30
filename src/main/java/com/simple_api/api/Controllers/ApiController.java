package com.simple_api.api.Controllers;

import com.google.gson.Gson;
import com.simple_api.api.Models.UuidResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/uuid")
public class ApiController {

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public String getUuid() {
        Gson gson = new Gson();
        String response = gson.toJson(UuidResponse.builder()
                .isGenerated(true)
                .uuid(UUID.randomUUID().toString())
                .build());
        return response;
    }
}