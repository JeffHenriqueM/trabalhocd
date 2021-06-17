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

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;
	
	@GetMapping("/findAlunos")
    public List<Aluno> GetAllAlunos(){
        return repository.findAll();
    }
	
	@GetMapping("/findAlunoById/{cpf}")
    public Aluno findAlunoByCpf(@PathVariable String cpf){
        return repository.findById(cpf).get();
    }
	
    @PostMapping("/aluno")
    public Aluno saveAluno(@RequestBody Aluno aluno){    
        return repository.save(aluno);
    }
    
    @PutMapping("/updateAluno/{cpf}")
    public Aluno updateAluno(@PathVariable String cpf, @RequestBody Aluno novoAluno){    
    	novoAluno.cpf = cpf;
    	
        return repository.save(novoAluno);
    }
    
	@DeleteMapping ("/deleteAlunoByCpf/{cpf}")
    public String deleteAlunoByCpf(@PathVariable String cpf){
       try {
    	   repository.deleteById(cpf);
    	   return "Aluno removido da base de dados";
       } catch (Exception ex){
    	   return "Cpf não existe na base de dados";
       }
    }
}
