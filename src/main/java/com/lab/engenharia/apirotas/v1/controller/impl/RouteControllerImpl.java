package com.lab.engenharia.apirotas.v1.controller.impl;

import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;
import com.lab.engenharia.apirotas.v1.controller.RouteController;
import com.lab.engenharia.apirotas.v1.service.RouteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("route/v1")
@RequiredArgsConstructor
@Slf4j
public class RouteControllerImpl implements RouteController {

    private final RouteService routeService;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<RouteDto> getRoute(@PathVariable String id) {
        return ok(routeService.getRouteInfo(id));
    }

    @Override
    @GetMapping("/routes")
    public ResponseEntity<List<RouteDto>> getRoutes() {
        return ok(routeService.getAllRoutes());
    }

    @Override
    @GetMapping("/routes/status/{status}")
    public ResponseEntity<List<RouteSummaryDto>> getAllRoutesByStatus(@PathVariable String status) {
        return ok(routeService.getRoutesByStatus(status));
    }

    @Override
    @PostMapping
    public ResponseEntity<RouteDto> createRoute(RouteDto routeDto) {
        return ok(routeService.createRoute(routeDto));
    }
}
