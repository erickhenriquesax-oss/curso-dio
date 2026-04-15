package br.com.dio.dao;

public class UserNotFoundException extends RuntimeException {


    public UserNotFoundException(final String message) {
        super(message);
    }

}
