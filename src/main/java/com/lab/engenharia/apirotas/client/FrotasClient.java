package com.lab.engenharia.apirotas.client;

import com.lab.engenharia.apirotas.model.frotas.DriverSummaryDto;
import com.lab.engenharia.apirotas.model.frotas.VehicleSummaryDto;

import java.util.List;

public interface FrotasClient {

    List<VehicleSummaryDto> getVehiclesSummary(String status);

    List<DriverSummaryDto> getDriversSummary(String status);

}
