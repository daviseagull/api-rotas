package com.lab.engenharia.apirotas.model;

import com.lab.engenharia.apirotas.model.enums.StatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RouteDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 2209970243193098281L;

    @Schema(name = "id", description = "Route's id", required = true)
    private String id;

    @Schema(name = "status", description = "Route's status", required = true)
    private StatusEnum status;

    @Schema(name = "startTimestamp", description = "Route's startTimestamp", required = true)
    private LocalDateTime startTimestamp;

    @Schema(name = "endTimestamp", description = "Route's endTimestamp", required = true)
    private LocalDateTime endTimestamp;

    @Schema(name = "startAddress", description = "Route's startAddress", required = true)
    private String startAddress;

    @Schema(name = "endAddress", description = "Route's endAddress", required = true)
    private String endAddress;

    @Schema(name = "price", description = "Route's price", required = true)
    private Double price;

    @Schema(name = "passengerQuantity", description = "Route's passengerQuantity", required = true)
    private Integer passengerQuantity;

    @Schema(name = "needLuggageRack", description = "Route's needLuggageRack", required = true)
    private Boolean needLuggageRack;

    @Schema(name = "vehicleId", description = "Route's vehicleId", required = true)
    private String vehicleId;

    @Schema(name = "driverId", description = "Route's driverId", required = true)
    private String driverId;
}
