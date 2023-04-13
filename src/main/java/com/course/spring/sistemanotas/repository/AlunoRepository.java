package com.course.spring.sistemanotas.repository;

import com.course.spring.sistemanotas.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    //@Override
    List<Aluno> findByNome(String nome, String cpf);
}
