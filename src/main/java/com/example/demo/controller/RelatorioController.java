package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Relatorio;
import com.example.demo.repository.RelatorioRepository;

@RestController
public class RelatorioController {
	
	@Autowired
	RelatorioRepository repository;
	
	@GetMapping("/findRelatorios")
    public List<Relatorio> GetAllRelatorios(){
        return repository.findAll();
    }
	
    @PostMapping("/relatorio")
    public Relatorio saveRelatorio(@RequestBody Relatorio relatorio){    
        return repository.save(relatorio);
    }

}
