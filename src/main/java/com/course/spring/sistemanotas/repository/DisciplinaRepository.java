package com.course.spring.sistemanotas.repository;

import com.course.spring.sistemanotas.model.Disciplina;
import com.course.spring.sistemanotas.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    Optional<Disciplina> findByProfessor(Professor professor);
}
