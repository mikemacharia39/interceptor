package com.mikehenry.interceptor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class OrderNotAllowedException extends ApplicationException{

    public OrderNotAllowedException(String message) {
        super(message);
    }
}
