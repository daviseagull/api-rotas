package com.lab.engenharia.apirotas.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class FrotasFeignClientConfig {

    @Value("${BASIC_USER}")
    private String user;

    @Value("${BASIC_PASSWORD}")
    private String password;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(user, password);
    }
}
