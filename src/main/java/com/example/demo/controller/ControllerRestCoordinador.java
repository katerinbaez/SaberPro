package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Coordinador;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repositpry.CoordinadorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControllerRestCoordinador {
	@Autowired
	private CoordinadorRepository coordinadorRepository;

	@GetMapping("/")
	public List<Coordinador> getAllAsociacions() {
		return coordinadorRepository.findAll();

	}

	@GetMapping("/{id}")
	public Coordinador getCoordinadorById(@PathVariable String id) {
		return coordinadorRepository.findById(id).orElseThrow(() -> new NotFoundException("Coordinador no encontrada"));
	}

	@PostMapping("/")
	public Coordinador saveCoordinador(@RequestBody Map<String, Object> body) {
		ObjectMapper mapper = new ObjectMapper();
		Coordinador asociacion = mapper.convertValue(body, Coordinador.class);
		return coordinadorRepository.save(asociacion);
	}

	@PutMapping("/{id}")
	public Coordinador updateCoordinador(@PathVariable String id, @RequestBody Map<String, Object> body) {
		ObjectMapper mapper = new ObjectMapper();
		Coordinador asociacion = mapper.convertValue(body, Coordinador.class);
		asociacion.setId(id);
		return coordinadorRepository.save(asociacion);
	}

	@DeleteMapping("/{id}")
	public Coordinador deleteCoordinador(@PathVariable String id) {
		Coordinador asociacion = coordinadorRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Club no encontrado"));
		coordinadorRepository.deleteById(id);
		return asociacion;
	}
}
