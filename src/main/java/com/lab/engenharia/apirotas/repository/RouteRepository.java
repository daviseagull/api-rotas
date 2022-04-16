package com.lab.engenharia.apirotas.repository;

import com.lab.engenharia.apirotas.entity.Route;
import com.lab.engenharia.apirotas.model.enums.StatusEnum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RouteRepository extends MongoRepository<Route, String> {

    List<Route> findAllByStatus(StatusEnum status);
}
