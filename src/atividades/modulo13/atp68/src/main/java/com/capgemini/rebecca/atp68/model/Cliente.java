package com.capgemini.rebecca.atp68.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String cpf;

    @Getter @Setter
    private int idade;

    @Getter @Setter
    @ManyToOne
    private TipoCliente tipo;
}
