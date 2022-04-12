package com.lab.engenharia.apirotas.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomerDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4501221438981597100L;

    @Schema(name = "id", description = "Customer's id", required = true)
    private String id;

    @Schema(name = "name", description = "Customer's name", required = true)
    private String name;

    @Schema(name = "age", description = "Customer's age", required = true)
    private Integer age;

    @Schema(name = "cpf", description = "Customer's cpf", required = true)
    @CPF
    private Long cpf;

    @Builder
    public CustomerDto(String id, String name, Integer age, Long cpf) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public CustomerDto() {
    }
}
