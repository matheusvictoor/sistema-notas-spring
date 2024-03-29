package com.course.spring.sistemanotas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CPF
    @Column(unique = true) // Para não ter cpf repetido
    private String cpf;

    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    private String nome;

    @Column(name = "nascimento")
    private LocalDate dataNascimento;

    private String curso;

    private Integer serie;

    private String telefone;

}
