package com.course.spring.sistemanotas.controller;

import com.course.spring.sistemanotas.model.Aluno;
import com.course.spring.sistemanotas.service.AlunoService;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    public  AlunoController(AlunoService service){
        this.service = service;
    }
    @GetMapping
    @ApiOperation(value = "Endpoint para buscar alunos",
            notes = "Endpoint usado para buscar todos os alunos presentes no sistema",
            response = Aluno.class,
            httpMethod = "GET")
    public ResponseEntity<?> buscarAlunos() {
        return ResponseEntity.ok(service.buscarAlunos());
    }
    @GetMapping(value = "/busca/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarAlunoPorId(id));
    }
    @GetMapping(value = "/busca-nome/{nome}")
    public ResponseEntity<?> buscarAlunosPorNome(@PathVariable String nome){
        return ResponseEntity.ok(service.buscarAlunosPorNome(nome));
    }
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid Aluno aluno){
        return ResponseEntity.ok(service.salvar(aluno));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id){
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
