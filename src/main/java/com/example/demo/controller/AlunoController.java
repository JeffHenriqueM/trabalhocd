package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
    @PostMapping("/aluno")
    public Aluno saveAluno(@RequestBody Aluno aluno){    
        return repository.save(aluno);
    }

}
