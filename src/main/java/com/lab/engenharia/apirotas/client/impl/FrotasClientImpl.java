package com.lab.engenharia.apirotas.client.impl;

import com.lab.engenharia.apirotas.client.FrotasClient;
import com.lab.engenharia.apirotas.client.FrotasFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FrotasClientImpl implements FrotasClient {

    private final FrotasFeignClient feignClient;

    @Override
    public String getHello() {
        return feignClient.getHello().getBody();
    }
}
