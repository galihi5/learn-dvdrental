package com.gaw.learndvdrental.lesson_jdbc.actor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Order(2)
@Component
public class ActorApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ActorDao actorDao;

    @Override
    public void run(String... args) throws Exception {
        logger.info("ActorApplication...");
        /*actorDao.insertActor(new Actor(0, "Sapi", "Oodin", new Date()));

        actorDao.updateActor(new Actor(203, "Sapii", "Odinson", new Date()));

        actorDao.getAllActors().stream().forEach( actor -> {
            logger.info("{} - {} {}", actor.getActorId(), actor.getFirstName(), actor.getLastName());
        }); */

//        logger.info("Player with Id 204: {}", actorDao.getActorById(204));
//        logger.info("Deleting Actor with ID 204 : {}", actorDao.deleteActorById(204));
//        logger.info("Player with Id 203: {}", actorDao.getActorById(203));
    }
}
