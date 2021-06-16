package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Paciente;
import com.example.demo.repository.PacienteRepository;

@RestController
public class PacienteController {
	
	@Autowired
	PacienteRepository repository;
	
	@GetMapping("/findPacientes")
    public List<Paciente> GetAllPacientes(){
        return repository.findAll();
    }
	
    @PostMapping("/paciente")
    public Paciente savePaciente(@RequestBody Paciente paciente){    
        return repository.save(paciente);
    }

}
