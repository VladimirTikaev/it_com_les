package com.overone.repo;

import com.overone.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person, Long> {
    Person findByName(String name);

}
