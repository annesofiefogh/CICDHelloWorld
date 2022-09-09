package com.example.cicd.controllers;

import com.example.cicd.models.Dog;
import com.example.cicd.services.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class DogController {

    private DogService dogServ;

    public DogController(DogService dogServ){
        this.dogServ = dogServ;
    }

    @GetMapping("/getAllDogs")
    public ResponseEntity<Set<Dog>> getAllDogs(){
        return new ResponseEntity<>(dogServ.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addDog")
    public ResponseEntity<Set<Dog>> addDog(Dog newDog){
        dogServ.save(newDog);
        return new ResponseEntity<>(dogServ.findAll(), HttpStatus.OK);
    }
}
