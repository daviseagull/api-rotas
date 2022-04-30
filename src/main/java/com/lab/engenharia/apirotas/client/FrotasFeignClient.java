package com.lab.engenharia.apirotas.client;

import com.lab.engenharia.apirotas.config.FrotasFeignClientConfig;
import com.lab.engenharia.apirotas.model.frotas.DriverSummaryDto;
import com.lab.engenharia.apirotas.model.frotas.VehicleSummaryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "FrotasFeignClient",
        url = "${URL_API_FROTAS}",
        configuration = FrotasFeignClientConfig.class)
public interface FrotasFeignClient {

    @GetMapping(value = "/vehicles/status/{status}")
    ResponseEntity<List<VehicleSummaryDto>> getVehiclesSummary(@PathVariable String status);

    @GetMapping(value = "/drivers/status/{status}")
    ResponseEntity<List<DriverSummaryDto>> getDriversSummary(@PathVariable String status);
}
