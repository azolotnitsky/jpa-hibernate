package com.epam.javacc.microservices.jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private OrderStatus status;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "driver_id")
    private Driver driver;


    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public OrderStatus getOrderStatus() {
	return status;
    }

    public void setOrderStatus(OrderStatus status) {
	this.status = status;
    }

    public Driver getDriver() {
	return driver;
    }

    public void setDriver(Driver driver) {
	this.driver = driver;
    }

}
