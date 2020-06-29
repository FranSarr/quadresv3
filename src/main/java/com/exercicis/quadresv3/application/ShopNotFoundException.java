package com.exercicis.quadresv3.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ShopNotFoundException extends RuntimeException{
        ShopNotFoundException(int id) { super("Could not find shop " + id);}
}
