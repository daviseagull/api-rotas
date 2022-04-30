package com.lab.engenharia.apirotas.v1.service;

import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;

import java.util.List;

public interface RouteService {

    RouteDto getRouteInfo(String id);

    List<RouteDto> getAllRoutes();

    List<RouteSummaryDto> getRoutesByStatus(String status);

    RouteDto createRoute(RouteDto routeDto);
}
