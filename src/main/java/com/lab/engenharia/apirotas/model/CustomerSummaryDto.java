package com.lab.engenharia.apirotas.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomerSummaryDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8311783816759433012L;

    @Schema(name = "id", description = "Customer's id", required = true)
    private String id;

    @Schema(name = "name", description = "Customer's name", required = true)
    private String name;

    @Builder
    public CustomerSummaryDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerSummaryDto() {
    }
}
