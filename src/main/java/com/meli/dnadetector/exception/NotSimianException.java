package com.meli.dnadetector.exception;

public class NotSimianException extends RuntimeException{

        private static final long serialVersionUID = 1L;

        public NotSimianException() {
            this(null);
        }

        public NotSimianException(String message){
            super(message);
        }
}
