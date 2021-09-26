package com.example.coursespring.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }
}
