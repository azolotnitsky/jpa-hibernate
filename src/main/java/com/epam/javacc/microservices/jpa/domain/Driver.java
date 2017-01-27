package com.epam.javacc.microservices.jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DRIVERS")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fio")
    private String fio;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getFio() {
	return fio;
    }

    public void setFio(String fio) {
	this.fio = fio;
    }
}
