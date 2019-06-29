package ru.avalon.blog.exceptions;

public class DataIntegrityViolationException extends Exception{

    public DataIntegrityViolationException() {
    }

    public DataIntegrityViolationException(String string) {
        super(string);
    }
    
}
