package com.example.demo.repositpry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

}
