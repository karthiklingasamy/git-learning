package com.karthik.util;

public class PasswordGeneration {

    public PasswordGeneration(String algo){
        System.out.println("Password Generator Object is cretaed");
        System.out.println("Aggo used for password generation is:"+algo);

    }

    public boolean generatePassword(){

        System.out.println("Passowrd Generated Using SHA256 algo");
        return true;
    }
}
