package com.example.nutriplanapi.exception;

import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;

public class InvalidUserRequestException extends Exception {
    public InvalidUserRequestException (String dataDeUsuarioInvalido) {
        super(dataDeUsuarioInvalido);
    }
}
