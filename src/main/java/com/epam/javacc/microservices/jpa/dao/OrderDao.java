package com.epam.javacc.microservices.jpa.dao;

import com.epam.javacc.microservices.jpa.domain.Order;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class OrderDao extends BasicDao<Order> {

    private final Log LOG = LogFactory.getLog(getClass());

    public List<Order> getOrdersByDriverId(Long driverId) {

       Query query = entityManager.createQuery("from Order where driver_id = :driverId");
       query.setParameter("driverId", driverId);
       List<Order> orderList = query.getResultList();

       return orderList;
   }
}