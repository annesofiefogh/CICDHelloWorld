package com.example.cicd.services;

import com.example.cicd.models.Dog;
import com.example.cicd.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DogService implements IDogService{

    private DogRepository dogRepo;

    public DogService(DogRepository dogRepo){
        this.dogRepo = dogRepo;
    }

    @Override
    public Set<Dog> findAll() {
        Set<Dog> set = new HashSet<>();
        dogRepo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Dog save(Dog object) {
        return dogRepo.save(object);
    }

    @Override
    public void delete(Dog object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Dog> findById(Long aLong) {
        return Optional.empty();
    }
}
