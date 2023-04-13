package com.course.spring.sistemanotas.repository;

import com.course.spring.sistemanotas.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
