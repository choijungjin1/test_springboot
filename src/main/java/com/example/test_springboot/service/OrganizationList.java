package com.example.test_springboot.service;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service


public class OrganizationList{
    
        public Object actionMethod() {
            Map<String, Object> data01 = new HashMap<String, Object>();
            List<Object> resultObject = new ArrayList<Object>();
            data01.put("MEMBER_ID", "103029301202");
            data01.put("USER_NAME", "BAEK SEONG HOON");
            data01.put("PHONE_NUMBER", "010-3028-6003");
            data01.put("EMAIL","mid3830@gmail.com");
            data01.put("AGE", "24");
    
            Map<String,Object> data02 = new HashMap<String,Object>();
            data02.put("MEMBER_ID", "10284561564");
            data02.put("USER_NAME", "SEAN BAEK");
            data02.put("PHONE_BUMBER", "010-1111-1111");
            data02.put("EMAIL","sg03142@naver.com");
            data02.put("AGE","19");
            
            resultObject.add(data01);
            resultObject.add(data02);
    
            return resultObject;
        
    }
}