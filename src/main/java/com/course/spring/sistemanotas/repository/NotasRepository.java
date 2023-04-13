package com.course.spring.sistemanotas.repository;

import com.course.spring.sistemanotas.model.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotasRepository extends JpaRepository<Notas, Integer> {

}
