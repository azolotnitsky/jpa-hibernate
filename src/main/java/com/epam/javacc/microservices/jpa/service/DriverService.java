package com.epam.javacc.microservices.jpa.service;

import com.epam.javacc.microservices.jpa.dao.DriverDao;
import com.epam.javacc.microservices.jpa.domain.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverDao driverDao;

    public List<Driver> getDrivers() {
        return driverDao.getDrivers();
    }

    public void setDriverDao(DriverDao driverDao) {
        this.driverDao = driverDao;
    }

}
