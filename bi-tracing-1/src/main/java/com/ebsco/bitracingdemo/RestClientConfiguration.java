//package com.ebsco.bitracingdemo;
//
//import com.amazonaws.xray.proxies.apache.http.HttpClientBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.client.ClientHttpRequestFactory;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//
//@Configuration
//public class RestClientConfiguration {
//
//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate(clientHttpRequestFactory());
//    }
//
//    @Bean
//    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        clientHttpRequestFactory.setHttpClient(HttpClientBuilder.create().build());
//        return clientHttpRequestFactory;
//    }
////    private ClientHttpRequestFactory clientHttpRequestFactory() {
////        return new HttpComponentsClientHttpRequestFactory(HttpClientBuilder.create().build());
////    }
//}
