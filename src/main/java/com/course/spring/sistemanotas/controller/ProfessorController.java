package com.course.spring.sistemanotas.controller;

import com.course.spring.sistemanotas.model.Professor;
import com.course.spring.sistemanotas.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService service;
    @GetMapping
    public ResponseEntity<?> buscarProfessores(){
        return ResponseEntity.ok(service.buscarProfessores());
    }
    @GetMapping(value = "/busca/{id}")
    public ResponseEntity<?> buscarProfessoresPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarProfessorPorId(id));
    }
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid Professor professor){
        return ResponseEntity.ok(service.salvar(professor));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id){
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
