package com.karthik.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {

    public Dao(){
        System.out.println("DAO Object is created");
    }

    public boolean saveData(){
        System.out.println("Data Saved");
        return true;
    }
}
