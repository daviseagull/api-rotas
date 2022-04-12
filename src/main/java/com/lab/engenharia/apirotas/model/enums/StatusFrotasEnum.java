package com.lab.engenharia.apirotas.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Optional;

public enum StatusFrotasEnum {
    UNAVAILABLE("unavailable", "Indisponível"),
    AVAILABLE("available", "Disponível"),
    IN_USE("inUse", "Em uso");

    private final String statusName;
    private final String statusValue;

    StatusFrotasEnum(String statusValue, String statusName) {
        this.statusValue = statusValue;
        this.statusName = statusName;
    }

    public static Optional<StatusFrotasEnum> getInstanceByName(String statusName) {
        return Arrays.stream(values())
                .filter(v -> v.getStatusName().equalsIgnoreCase(statusName))
                .findFirst();
    }

    public static Optional<StatusFrotasEnum> getInstanceByValue(String statusValue) {
        return Arrays.stream(values())
                .filter(v -> v.getStatusValue().equalsIgnoreCase(statusValue))
                .findFirst();
    }

    @JsonValue
    public String getStatusName() {
        return statusName;
    }

    public String getStatusValue() {
        return statusValue;
    }
}
