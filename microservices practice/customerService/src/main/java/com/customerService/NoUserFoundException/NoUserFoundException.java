package com.customerService.NoUserFoundException;

public class NoUserFoundException  extends Exception{
    NoUserFoundException(String msg){
        super("no user found..");
    }
}
