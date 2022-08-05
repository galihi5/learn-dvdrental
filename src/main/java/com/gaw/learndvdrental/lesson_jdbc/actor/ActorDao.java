package com.gaw.learndvdrental.lesson_jdbc.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class ActorDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Actor> getAllActors(){
        String sql = "SELECT * FROM ACTOR";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Actor>(Actor.class));
    }

    public Actor getActorById(int actorId){
        String sql = "SELECT * FROM ACTOR WHERE ACTOR_ID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Actor>(Actor.class), new Object[]{actorId});
    }

    public int insertActor(Actor actor){
        String sql = "INSERT INTO ACTOR(FIRST_NAME, LAST_NAME, LAST_UPDATE) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql,
                new Object[]{actor.getFirstName(), actor.getLastName(), actor.getLastUpdate()}
                );
    }

    public int updateActor(Actor actor){
        String sql = "UPDATE ACTOR SET FIRST_NAME = ?, LAST_NAME = ?, LAST_UPDATE = ? WHERE ACTOR_ID = ?";

        return jdbcTemplate.update(sql, new Object[]{actor.getFirstName(), actor.getLastName(), actor.getLastUpdate(), actor.getActorId()});
    }

    public int deleteActorById(int id){
        String sql = "DELETE FROM ACTOR WHERE ACTOR_ID = ?";
        return jdbcTemplate.update(sql, new Object[]{id});
    }
}
