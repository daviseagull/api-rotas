package com.lab.engenharia.apirotas.exception;

public class RouteNotFoundException extends RuntimeException{

    private final String message;

    public RouteNotFoundException(String message) {
        this.message = message;
    }
}
