package com.meli.dnadetector.exception;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ResponseExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NotSimianException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Error handleNotSimianException(NotSimianException exception) {
        return Error.builder()
                .message("Not a simian")
                .build();
    }

    @ResponseBody
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleConstraintViolationException(ConstraintViolationException exception) {
        return Error.builder()
                .message("You tried to send a request with invalid data, please review and resend it.")
                .build();
    }

    @ResponseBody
    @ExceptionHandler(JsonMappingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error handleJsonMappingException(JsonMappingException exception) {
        return Error.builder()
                .message(exception.getMessage())
                .build();
    }
}
