package com.example.trabalhocd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController{

    CarroRepository repository;

    @GetMapping("/carro")
    public List<Carro> getAllCarros(){
        return repository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id){
        return repository.getOne(id);
    }

    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }

    

}