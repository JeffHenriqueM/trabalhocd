package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String>{ 


}
