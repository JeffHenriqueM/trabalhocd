package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Procedimento;
import com.example.demo.repository.ProcedimentoRepository;

@RestController
public class ProcedimentoController {

	@Autowired
	ProcedimentoRepository repository;

	@GetMapping("/findProcedimentos")
	public List<Procedimento> GetAllProcedimentos() {
		return repository.findAll();
	}

	@PostMapping("/procedimento")
	public Procedimento saveProcedimento(@RequestBody Procedimento procedimento) {
		return repository.save(procedimento);
	}

}
