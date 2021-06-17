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
import com.example.demo.model.Atendimento;
import com.example.demo.model.Atendimento;
import com.example.demo.repository.AtendimentoRepository;
import com.example.demo.repository.RelatorioRepository;

@RestController
public class AtendimentoController {
	
	@Autowired
	AtendimentoRepository repository;
	
	RelatorioRepository repositoryRelatorio;
	
	@GetMapping("/findAtendimentos")
    public List<Atendimento> GetAllAtendimentos(){
        return repository.findAll();
    }
	
	@GetMapping("/findAtendimentoById/{id}")
    public Atendimento findAtendimentoById(@PathVariable int id){
        return repository.findById(id).get();
    }
	
    @PostMapping("/atendimento")
    public Atendimento saveAtendimento(@RequestBody Atendimento atendimento){    
        return repository.save(atendimento);
    }
    
    @PutMapping("/updateAtendimento/{id}")
    public Atendimento updateAluno(@PathVariable int id, @RequestBody Atendimento novoAtendimento){    
    	novoAtendimento.id = id;
    	
        return repository.save(novoAtendimento);
    }
    
    @DeleteMapping ("/deleteAtendimentoById/{Id}")
    public String deleteAtendimentoById(@PathVariable int Id){
        try {
        	repository.deleteById(Id);
     	   return "Atendimento removido da base de dados";
        } catch (Exception ex){
     	   return "Id não existe na base de dados";
        }
    }
    
    /*@PutMapping("/finalizarAtendimento/{id}")
    public String finalizarAtendimento(@RequestBody int Id){    
    	System.out.print(repositoryRelatorio.findByAtendimentoId(Id));
    	return "Finalizado";
    }*/

}
