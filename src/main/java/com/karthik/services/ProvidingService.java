package com.karthik.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.karthik.dao.Dao;
@Service(value="service")
public class ProvidingService {

    @Autowired
    private Dao dao;

    public ProvidingService(){
        System.out.println("Service Object is created");
    }

    public boolean invokeServices(){

        return dao.saveData();
    }
}
