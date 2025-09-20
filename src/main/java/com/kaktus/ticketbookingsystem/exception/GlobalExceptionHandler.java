package com.kaktus.ticketbookingsystem.exception;

import com.kaktus.ticketbookingsystem.dto.response.ApiResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<ApiResponse> handleEntityNotFoundException(EntityNotFoundException ex) {
        return ResponseEntity.ok(ApiResponse.builder()
                .message("entity not fouond")
                .status(HttpStatus.NOT_FOUND)
                .build());
    }


    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
    public ResponseEntity<ApiResponse> handleUnexpectedException(EntityNotFoundException ex) {
        return ResponseEntity.ok(ApiResponse.builder()
                .message("something went wrong")
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .build());
    }

}
