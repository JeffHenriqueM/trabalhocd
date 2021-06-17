package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento, String>{ 


}
