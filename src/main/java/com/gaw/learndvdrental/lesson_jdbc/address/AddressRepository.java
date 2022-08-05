package com.gaw.learndvdrental.lesson_jdbc.address;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AddressRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Address insertAddress(Address address){
        return entityManager.merge(address);
    }

    public Address updateAddress(Address address){
        return entityManager.merge(address);
    }

    public Address getAddressById(int id){
        return entityManager.find(Address.class, id);
    }

    public void deleteAddressById(int id){
        Address address = entityManager.find(Address.class, id);
        entityManager.remove(address);
    }
}
