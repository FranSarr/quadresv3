package com.exercicis.quadresv3.utilities;

public class ShopNotFoundException extends RuntimeException{
        public ShopNotFoundException(int id) {
            super("Could not find shop " + id);
        }
}
