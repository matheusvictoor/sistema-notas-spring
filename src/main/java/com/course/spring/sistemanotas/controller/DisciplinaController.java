package com.course.spring.sistemanotas.controller;

import com.course.spring.sistemanotas.model.Disciplina;
import com.course.spring.sistemanotas.service.DisciplinaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/disciplina")
public class DisciplinaController {

    private DisciplinaService service;

    @GetMapping()
    public ResponseEntity<?> buscarDisciplinas(){
        return ResponseEntity.ok(service.buscarDisciplinas());
    }

    @GetMapping(value = "/busca/{id}")
    public  ResponseEntity<?> buscarDisciplinaPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarDisciplinaPorId(id));
    }

    @GetMapping(value = "/busca-professor/{id}")
    public ResponseEntity<?> buscarDisciplinaPorIdProfessor(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarDisciplinaPorProfessor(id));
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid Disciplina disciplina){
        return ResponseEntity.ok(service.salvar(disciplina));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id){
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
