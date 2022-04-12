package com.lab.engenharia.apirotas.v1.controller;

import com.lab.engenharia.apirotas.model.RouteDto;
import com.lab.engenharia.apirotas.model.RouteSummaryDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RouteController {

    @Operation(
            summary = "Endpoint to get info of one route",
            responses = {
                    @ApiResponse(
                            description = "Data obtained with success.",
                            responseCode = "200",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = RouteDto.class))),
                    @ApiResponse(
                            description =
                                    "The Request was malformed, omitting mandatory attributes, either in the payload or through attributes in the url.",
                            responseCode = "400",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))),
                    @ApiResponse(
                            description = "Unmapped Error.",
                            responseCode = "500",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Object.class)))
            })
    ResponseEntity<RouteDto> getRoute(@PathVariable(value = "id") String id);

    @Operation(
            summary = "Endpoint to get info of all routes in DB",
            responses = {
                    @ApiResponse(
                            description = "Data obtained with success.",
                            responseCode = "200",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = RouteDto.class)))),
                    @ApiResponse(
                            description =
                                    "The Request was malformed, omitting mandatory attributes, either in the payload or through attributes in the url.",
                            responseCode = "400",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))),
                    @ApiResponse(
                            description = "Unmapped Error.",
                            responseCode = "500",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Object.class)))
            })
    ResponseEntity<List<RouteDto>> getRoutes();

    @Operation(
            summary = "Endpoint to get info of all routes by status in DB",
            responses = {
                    @ApiResponse(
                            description = "Data obtained with success.",
                            responseCode = "200",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = RouteSummaryDto.class)))),
                    @ApiResponse(
                            description =
                                    "The Request was malformed, omitting mandatory attributes, either in the payload or through attributes in the url.",
                            responseCode = "400",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))),
                    @ApiResponse(
                            description = "Unmapped Error.",
                            responseCode = "500",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Object.class)))
            })
    ResponseEntity<List<RouteSummaryDto>> getAllRoutesByStatus(
            @PathVariable(value = "status") String status);

    @Operation(
            summary = "Endpoint to create one route",
            responses = {
                    @ApiResponse(
                            description = "Data obtained with success.",
                            responseCode = "200",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = RouteDto.class))),
                    @ApiResponse(
                            description =
                                    "The Request was malformed, omitting mandatory attributes, either in the payload or through attributes in the url.",
                            responseCode = "400",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))),
                    @ApiResponse(
                            description = "Unmapped Error.",
                            responseCode = "500",
                            content =
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Object.class)))
            })
    ResponseEntity<RouteDto> createRoute(@RequestBody RouteDto routeDto);
}
