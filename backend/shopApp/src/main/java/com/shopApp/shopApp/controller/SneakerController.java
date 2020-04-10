package com.shopApp.shopApp.controller;


import com.shopApp.shopApp.models.Sneaker;
import com.shopApp.shopApp.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SneakerController {
    @Autowired
    SneakerRepository sneakerRepository;


    @GetMapping(value = "/sneakers")
    public ResponseEntity<List<Sneaker>> getAllSneakers(){
        return new ResponseEntity<>(sneakerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/sneakers/{id}")
    public ResponseEntity getSneaker(@PathVariable Long id){
        return new ResponseEntity<>(sneakerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/sneakers")
    public ResponseEntity<Sneaker> postSneaker(@RequestBody Sneaker sneaker){
        sneakerRepository.save(sneaker);
        return new ResponseEntity<>(sneaker, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/sneakers/{id}")
    public ResponseEntity<Sneaker> updateCSneaker(@RequestBody Sneaker sneaker){
        sneakerRepository.save(sneaker);
        return new ResponseEntity<>(sneaker, HttpStatus.OK);
    }

    @DeleteMapping(value = "/sneakers/{id}")
    public ResponseEntity<Sneaker> deleteSneaker(@PathVariable Long id) {
        Sneaker found = sneakerRepository.getOne(id);
        sneakerRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
