package com.course.spring.sistemanotas.repository;

import com.course.spring.sistemanotas.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
