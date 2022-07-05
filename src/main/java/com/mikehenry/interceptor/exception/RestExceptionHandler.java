package com.mikehenry.interceptor.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RequiredArgsConstructor
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private final MessageSource messageSource;

    @ExceptionHandler(OrderNotAllowedException.class)
    public final ResponseEntity<OrderNotAllowedException> handleOrderNotAllowed(OrderNotAllowedException exception, WebRequest webRequest) {
        return new ResponseEntity<>(exception, HttpStatus.NOT_ACCEPTABLE);
    }

}
