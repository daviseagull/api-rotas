package com.lab.engenharia.apirotas.repository;

import com.lab.engenharia.apirotas.entity.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {
}
