package com.example.demo;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class VehicleDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Vehicle v) {
        entityManager.persist(v);
    }

    public Vehicle getById(int id) {
        return entityManager.find(Vehicle.class, id);
    }
}
