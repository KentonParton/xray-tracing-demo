package com.ebsco.bitracingdemo.service;

//import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.ebsco.bitracingdemo.model.DemoModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
//@XRayEnabled
public class DemoService {

    private final String url = "http://localhost:8081";

    public String requestOne() throws JsonProcessingException {
//        RestTemplate restTemplate = new RestTemplate();
//        String api_1 = restTemplate.getForObject("http://localhost:8082/demo2/demo2", String.class);
//        String api_2 = restTemplate.getForObject("http://localhost:8083/demo3/demo3", String.class);
//        return api_2;
        DemoModel name = new DemoModel();
        name.name = "Kenton";
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(name);
        return jsonString;
    }
}
