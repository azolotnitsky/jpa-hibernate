package com.epam.javacc.microservices.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class BasicDao<T> {

  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  protected EntityManager entityManager;

    public void saveOrUpdate(T obj) {
        entityManager.persist(obj);
    }

    public void remove(T obj) {
        if (entityManager.contains(obj))
           entityManager.remove(obj);
        else
          entityManager.remove(entityManager.merge(obj));
    }

}
