package com.lab.engenharia.apirotas.model.frotas;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DriverSummaryDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 6499250810663030044L;

    @Schema(name = "id", description = "Driver's id", required = true)
    private String id;

    @Schema(name = "name", description = "Driver's Name", example = "João", required = true)
    @NotNull
    private String name;
}
