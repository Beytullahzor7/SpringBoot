package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person); //allows us to insert a person with given id

    default int insertPerson(Person person){ //without an id, and id generated randomly
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> SelectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
