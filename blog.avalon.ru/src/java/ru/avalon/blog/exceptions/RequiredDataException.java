package ru.avalon.blog.exceptions;

public class RequiredDataException extends Exception{

    public RequiredDataException() {
    }

    public RequiredDataException(String string) {
        super(string);
    }
    
}
