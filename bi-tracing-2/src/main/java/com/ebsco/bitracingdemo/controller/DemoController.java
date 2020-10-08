package com.ebsco.bitracingdemo.controller;

import com.ebsco.bitracingdemo.service.DemoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo1/")
public class DemoController {

    private final DemoService svc;

    @Autowired
    DemoController(DemoService svc) { this.svc = svc;}

    @GetMapping(value = "/demo1", produces = { "application/json; charset=UTF-8" })
    public String requestOne() throws JsonProcessingException {
        return this.svc.requestOne();
    }
}
