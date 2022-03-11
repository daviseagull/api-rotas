package com.lab.engenharia.apirotas.client;

import com.lab.engenharia.apirotas.config.FrotasFeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    value = "FrotasFeignClient",
    url = "${URL_API_FROTAS}",
    configuration = FrotasFeignClientConfig.class)
public interface FrotasFeignClient {

  @GetMapping(value = "/hello")
  ResponseEntity<String> getHello();
}
