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

import com.example.demo.model.Relatorio;
import com.example.demo.model.Relatorio;
import com.example.demo.model.Relatorio;
import com.example.demo.repository.RelatorioRepository;

@RestController
public class RelatorioController {

	@Autowired
	RelatorioRepository repository;

	@GetMapping("/findRelatorios")
	public List<Relatorio> GetAllRelatorios() {
		return repository.findAll();
	}

	@GetMapping("/findRelatorioById/{id}")
	public Relatorio findRelatorioById(@PathVariable long id) {
		return repository.findById(id).get();
	}

	@PutMapping("/updateRelatorio/{id}")
	public Relatorio updateAluno(@PathVariable int id, @RequestBody Relatorio novoRelatorio) {
		novoRelatorio.id = id;

		return repository.save(novoRelatorio);
	}

	@DeleteMapping("/deleteRelatorioById/{Id}")
	public String deleteRelatorioById(@PathVariable long Id) {
		try {
			repository.deleteById(Id);
			return "Relatorio removido da base de dados";
		} catch (Exception ex) {
			return "Id não existe na base de dados";
		}
	}

}
