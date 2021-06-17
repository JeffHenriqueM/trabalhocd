package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Paciente;
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
	
	@GetMapping("/findPacienteById/{id}")
    public Paciente findPacienteById(@PathVariable long id){
        return repository.findById(id).get();
    }
	
    @PostMapping("/paciente")
    public Paciente savePaciente(@RequestBody Paciente paciente){    
        return repository.save(paciente);
    }
    
    @PutMapping("/updatePaciente/{id}")
    public Paciente updateAluno(@PathVariable int id, @RequestBody Paciente novoPaciente){    
    	novoPaciente.id = id;
    	
        return repository.save(novoPaciente);
    }
    
    @DeleteMapping ("/deletePacienteById/{Id}")
    public String deletePacienteById(@PathVariable long Id){
    	 try {
         	repository.deleteById(Id);
      	   return "Paciente removido da base de dados";
         } catch (Exception ex){
      	   return "Id não existe na base de dados";
         }
    }

}
