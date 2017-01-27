package com.epam.javacc.microservices.jpa.dao;

import com.epam.javacc.microservices.jpa.domain.Driver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class DriverDao extends BasicDao<Driver> {

    private final Log LOG = LogFactory.getLog(getClass());

    public List<Driver> getDrivers() {

        List<Driver> driversList = entityManager.createQuery("from Driver").getResultList();

        return driversList;
    }
}