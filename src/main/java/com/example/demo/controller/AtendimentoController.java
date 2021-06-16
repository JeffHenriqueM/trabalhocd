package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Atendimento;
import com.example.demo.repository.AtendimentoRepository;

@RestController
public class AtendimentoController {
	
	@Autowired
	AtendimentoRepository repository;
	
	@GetMapping("/findAtendimentos")
    public List<Atendimento> GetAllAtendimentos(){
        return repository.findAll();
    }
	
    @PostMapping("/atendimento")
    public Atendimento saveAtendimento(@RequestBody Atendimento atendimento){    
        return repository.save(atendimento);
    }

}
