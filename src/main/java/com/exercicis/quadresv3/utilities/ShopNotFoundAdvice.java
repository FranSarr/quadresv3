package com.exercicis.quadresv3.utilities;

import com.exercicis.quadresv3.application.ShopNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ShopNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ShopNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String shopNotFoundHandler(ShopNotFoundException ex) {
        return ex.getMessage();
    }
}
