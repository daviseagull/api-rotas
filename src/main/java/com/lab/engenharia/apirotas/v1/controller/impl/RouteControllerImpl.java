package com.lab.engenharia.apirotas.v1.controller.impl;

import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;
import com.lab.engenharia.apirotas.v1.controller.RouteController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("route/v1")
@RequiredArgsConstructor
@Slf4j
public class RouteControllerImpl implements RouteController {

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<RouteDto> getRoute(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping("/routes")
    public ResponseEntity<List<RouteDto>> getRoutes() {
        return null;
    }

    @Override
    @GetMapping("/drivers/status/{status}")
    public ResponseEntity<List<RouteSummaryDto>> getAllRoutesByStatus(@PathVariable String status) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<RouteDto> createRoute(RouteDto routeDto) {
        return null;
    }
}
