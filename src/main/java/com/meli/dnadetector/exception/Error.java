package com.meli.dnadetector.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Error {

    private String message;
}
