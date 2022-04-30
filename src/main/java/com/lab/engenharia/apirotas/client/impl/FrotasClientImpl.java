package com.lab.engenharia.apirotas.client.impl;

import com.lab.engenharia.apirotas.client.FrotasClient;
import com.lab.engenharia.apirotas.client.FrotasFeignClient;
import com.lab.engenharia.apirotas.model.frotas.DriverSummaryDto;
import com.lab.engenharia.apirotas.model.frotas.VehicleSummaryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FrotasClientImpl implements FrotasClient {

    private final FrotasFeignClient feignClient;

    @Override
    public List<VehicleSummaryDto> getVehiclesSummary(String status) {
        return feignClient.getVehiclesSummary(status).getBody();
    }

    @Override
    public List<DriverSummaryDto> getDriversSummary(String status) {
        return feignClient.getDriversSummary(status).getBody();
    }
}
