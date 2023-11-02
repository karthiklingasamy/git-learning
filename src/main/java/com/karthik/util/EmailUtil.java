package com.karthik.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

    @Autowired
    private PasswordGeneration passwordGeneration;

    public EmailUtil(){
        System.out.println("Email Util Object is created");
    }

    public boolean sendEmail(){
        System.out.println("Email Sent");
        return true;
    }

    public boolean password(){
        passwordGeneration.generatePassword();
        return true;
    }
}
