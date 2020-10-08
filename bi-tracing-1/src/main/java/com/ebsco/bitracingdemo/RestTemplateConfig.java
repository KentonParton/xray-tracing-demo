//package com.ebsco.bitracingdemo;
//
//import com.amazonaws.xray.proxies.apache.http.HttpClientBuilder;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//
//@Configuration
//public class RestTemplateConfig {
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
//
//        CloseableHttpClient client= HttpClientBuilder.create().build();
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(client);
//        return restTemplateBuilder.requestFactory(clientHttpRequestFactory).build();
//    }
//}