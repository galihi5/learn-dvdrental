package com.gaw.learndvdrental.lesson_jdbc.address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Order(1)
@Component
public class AddressApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("AddressApplication...");

        Address address = addressRepository.getAddressById(600);
        logger.info(">> Address with id 600 : {}, {}", address.getAddress(), address.getDistrict());

        Address insertedAddress = addressRepository.insertAddress(new Address(608, "Depok", null, "West Java", 1, "16412", "abc123", new Date()));
        logger.info(">> insert address: {}", insertedAddress.getAddressId());

        Address updatedAddress = addressRepository.insertAddress(new Address(606,"Depok 2", null, "West Java", 1, "16412", "abc123", new Date()));
        logger.info(">> update address: {}", updatedAddress.getAddressId());

        insertedAddress = addressRepository.insertAddress(new Address(607,"Depok 3", null, "West Java", 1, "16412", "abc123", new Date()));
        logger.info(">> insert address 2: {}", insertedAddress.getAddressId());

        logger.info(">> delete player by id");
        addressRepository.deleteAddressById(608);
    }
}
