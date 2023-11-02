package com.karthik.services;

import com.karthik.util.PasswordGeneration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    public Configure(){
        System.out.println("Configuration Object is created");
    }

    @Bean
    public PasswordGeneration customizedPassword(){
        PasswordGeneration passwordGeneration=new PasswordGeneration("SHA256");
        return passwordGeneration;
    }
}
