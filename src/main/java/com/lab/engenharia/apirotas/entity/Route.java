package com.lab.engenharia.apirotas.entity;

import com.lab.engenharia.apirotas.model.enums.StatusEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Document
public class Route {

    @Id
    private String id;

    private StatusEnum status;

    private LocalDateTime startTimestamp;

    private LocalDateTime endTimestamp;

    private String startAddress;

    private String endAddress;

    private Double price;

    private Integer passengerQuantity;

    private Boolean needLuggageRack;

    private String vehicleId;

    private String driverId;
}
