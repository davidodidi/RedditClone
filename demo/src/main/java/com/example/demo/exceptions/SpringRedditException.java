package com.example.demo.exceptions;

import org.springframework.mail.MailException;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage, Exception exception){
        super(exMessage);
    }
}
