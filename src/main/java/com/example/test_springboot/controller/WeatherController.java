package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController

public class WeatherController {
    @RequestMapping(value = "/remote/openweather", method = RequestMethod.GET)
    public Object actionMethod() {
    RestTemplate restTemplate = new RestTemplate();
    Object resultObject = new Object();
        String keyId = "c7530259fa51c14d5f06de82f87253e5";
        String targetUri = "https://api.openweathermap.org/data/2.5/forecast?q=London,us&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}