package com.gaw.learndvdrental.lesson_jdbc;


import com.gaw.learndvdrental.lesson_jdbc.actor.ActorDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ActorTests {
    @Autowired
    ActorDao actorDao;

    @Test
    public void testActor(){
        Assertions.assertNotNull(actorDao.getAllActors());
    }
}
