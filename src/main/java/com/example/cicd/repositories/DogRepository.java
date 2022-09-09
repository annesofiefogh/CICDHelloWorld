package com.example.cicd.repositories;

import com.example.cicd.models.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
