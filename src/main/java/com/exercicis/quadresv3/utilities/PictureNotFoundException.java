package com.exercicis.quadresv3.utilities;

public class PictureNotFoundException extends RuntimeException{
        public PictureNotFoundException(int id) {
            super("Could not find shop " + id);
        }
}
