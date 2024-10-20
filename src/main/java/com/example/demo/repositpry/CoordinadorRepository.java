package com.example.demo.repositpry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {

}
