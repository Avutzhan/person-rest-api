package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPesrson(UUID id, Person person);
    default int insertPesrson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPesrson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
