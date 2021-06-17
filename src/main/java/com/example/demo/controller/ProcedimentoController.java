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

import com.example.demo.model.Procedimento;
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
	
	
	@GetMapping("/findProcedimentoById/{codigo}")
    public Procedimento findProcedimentoByCodigo(@PathVariable String codigo){
        return repository.findById(codigo).get();
    }

	@PostMapping("/procedimento")
	public Procedimento saveProcedimento(@RequestBody Procedimento procedimento) {
		return repository.save(procedimento);
	}
	
	   @PutMapping("/updateProcedimento/{codigo}")
	    public Procedimento updateProcedimento(@PathVariable String codigo, @RequestBody Procedimento novoProcedimento){    
	    	novoProcedimento.codigo = codigo;
	    	
	        return repository.save(novoProcedimento);
	    }
	
    @DeleteMapping ("/deleteProcedimentoByCodigo/{Codigo}")
    public String deleteProcedimentoByCodigo(@PathVariable String Codigo){
    	 try {
          	repository.deleteById(Codigo);
       	   return "Procedimento removido da base de dados";
          } catch (Exception ex){
       	   return "Codigo não existe na base de dados";
          }
    }

}
