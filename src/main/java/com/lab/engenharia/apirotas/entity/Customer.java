package com.lab.engenharia.apirotas.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Document
public class Customer {

    @Id
    private String id;

    private String name;

    private Integer age;

    private Long cpf;

}
