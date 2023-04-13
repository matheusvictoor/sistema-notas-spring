package com.course.spring.sistemanotas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private  Disciplina disciplina;
    @NotNull
    private Double nota;
    @NotNull
    private String semestre;
    @NotNull
    private String ano;

}
