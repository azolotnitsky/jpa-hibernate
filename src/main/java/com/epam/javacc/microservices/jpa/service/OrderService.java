package com.epam.javacc.microservices.jpa.service;

import com.epam.javacc.microservices.jpa.dao.OrderDao;
import com.epam.javacc.microservices.jpa.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> getOrders(Long driverId) {
        return orderDao.getOrdersByDriverId(driverId);
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

}
