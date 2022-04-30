package com.lab.engenharia.apirotas.mapper;

import com.lab.engenharia.apirotas.entity.Route;
import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RouteMapper {

    RouteDto toRouteDto(Route route);

    RouteSummaryDto toRouteSummaryDto(Route vehicle);

    Route toRoute(RouteDto vehicleDto);
}
