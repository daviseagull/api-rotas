package com.lab.engenharia.apirotas.config.error;

import com.lab.engenharia.apirotas.exception.RouteNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@Slf4j
@RestControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(RouteNotFoundException.class)
    public ResponseEntity<List<String>> vehicleNotFoundErrorHandler(RouteNotFoundException ex) {

        log.error("RouteNotFoundException handler: ", ex);
        return status(OK).body(emptyList());
    }
}
