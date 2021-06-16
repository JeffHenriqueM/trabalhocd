package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Atendimento {
	@Id
	public int id;
	
	public String codigo_procedimento;
	public String cpf_aluno;
	public int id_paciente;
	public String status;

}
