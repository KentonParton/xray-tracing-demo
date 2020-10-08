package com.ebsco.bitracingdemo.controller;

import com.ebsco.bitracingdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("demo/")
public class DemoController {

    private final DemoService svc;

    @Autowired
    DemoController(DemoService svc) { this.svc = svc;}

    @GetMapping(value = "/requestOne", produces = { "application/json; charset=UTF-8" })
    public String requestOne() throws IOException {
        return this.svc.requestOne();
    }
}
