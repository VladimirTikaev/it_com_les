package com.overone.service;

import com.overone.model.Person;
import com.overone.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPerson(){
        return  personRepo.findAll();
    }

    public List<Person> getAllPersonById(Long id){
        return Arrays.asList(personRepo.findById(id).get());
    }


    public List<Person> getPersonByName(String name){
        return Arrays.asList(personRepo.findByName(name));
    }
}
