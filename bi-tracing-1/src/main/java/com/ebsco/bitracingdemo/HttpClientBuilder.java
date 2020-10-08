//package com.ebsco.bitracingdemo;
//
//import com.amazonaws.xray.AWSXRay;
//import com.amazonaws.xray.AWSXRayRecorder;
//import com.amazonaws.xray.proxies.apache.http.TracedHttpClient;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Wraps and overrides some of {@code org.apache.http.impl.client.HttpClientBuilder}'s methods. Will build a TracedHttpClient
// * wrapping the usual CloseableHttpClient result. Uses the global recorder by default, with an option to provide an alternative.
// */
//@Configuration
//public class HttpClientBuilder extends org.apache.http.impl.client.HttpClientBuilder {
//
//    private AWSXRayRecorder recorder;
//
//    protected HttpClientBuilder() {
//        super();
//    }
//
//    public static HttpClientBuilder create() {
//        HttpClientBuilder newBuilder = new HttpClientBuilder();
//        newBuilder.setRecorder(AWSXRay.getGlobalRecorder());
//        return newBuilder;
//    }
//
//    public HttpClientBuilder setRecorder(AWSXRayRecorder recorder) {
//        this.recorder = recorder;
//        return this;
//    }
//
//    @Override
//    public CloseableHttpClient build() {
//        CloseableHttpClient result = super.build();
//        return new TracedHttpClient(result, recorder);
//    }
//}
