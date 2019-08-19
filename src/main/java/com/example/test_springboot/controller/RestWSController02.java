package com.example.test_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test_springboot.service.OrganizationList;;

@CrossOrigin
@RestController
public class RestWSController02 {
    @Autowired
    OrganizationList organizationList;
    @RequestMapping(value="/ws/organizationList02")
    public Object actionMethod() {
        Object resultObject = new Object();
        resultObject = organizationList.actionMethod();
        return resultObject;
    }
    
}