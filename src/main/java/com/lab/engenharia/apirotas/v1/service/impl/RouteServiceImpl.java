package com.lab.engenharia.apirotas.v1.service.impl;

import com.lab.engenharia.apirotas.client.FrotasClient;
import com.lab.engenharia.apirotas.client.FrotasFeignClient;
import com.lab.engenharia.apirotas.exception.RouteNotFoundException;
import com.lab.engenharia.apirotas.mapper.RouteMapper;
import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;
import com.lab.engenharia.apirotas.model.enums.StatusEnum;
import com.lab.engenharia.apirotas.repository.RouteRepository;
import com.lab.engenharia.apirotas.v1.service.RouteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {

    private final RouteRepository repository;
    private final RouteMapper mapper;

    @Override
    public RouteDto getRouteInfo(String id) {
        log.info("Getting vehicle with id {}", id);

        var route =
                repository
                        .findById(id)
                        .orElseThrow(
                                () -> new RouteNotFoundException("Route with id " + id + " not found."));

        log.debug("Returning route with id {}: {}", id, route);
        return mapper.toRouteDto(route);
    }

    @Override
    public List<RouteDto> getAllRoutes() {
        log.info("Getting all routes.");
        var routes = repository.findAll();

        var routeDtos = routes.stream().map(mapper::toRouteDto).toList();

        log.debug("Returning routes {}", routeDtos);
        return routeDtos;
    }

    @Override
    public List<RouteSummaryDto> getRoutesByStatus(String status) {
        log.info("Getting all routes by status: {}", status);

        var statusEnum = StatusEnum.getInstanceByValue(status).orElseThrow();

        var routes = repository.findAllByStatus(statusEnum);

        var routesSummaryDto = routes.stream().map(mapper::toRouteSummaryDto).toList();

        log.debug("Returning routesSummary {}", routesSummaryDto);

        return routesSummaryDto;
    }

    @Override
    public RouteDto createRoute(RouteDto routeDto) {

        log.info("Salving route: {}", routeDto);

        var route = mapper.toRoute(routeDto);
        var savedRoute = repository.save(route);

        return mapper.toRouteDto(savedRoute);
    }

    @Override
    public Map<String,String> updateRoute(RouteDto routeDto) {
        var id = routeDto.getId();
        log.info("Updating route with id: {}", id);

        var routeOpt = repository.findById(id);
        if (routeOpt.isEmpty()) {
            throw new RouteNotFoundException("Not possible to update a non existing route");
        }

        var route = mapper.toRoute(routeDto);
        repository.save(route);

        return Map.of("id", id);
    }
}
