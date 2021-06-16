package com.example.trabalhocd;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Carro{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String nome;
}