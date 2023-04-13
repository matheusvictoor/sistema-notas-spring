package com.course.spring.sistemanotas.service;

import com.course.spring.sistemanotas.model.Aluno;
import com.course.spring.sistemanotas.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;
    public List<Aluno> buscarAlunos(){
        return repository.findAll();
    }
    public List<Aluno> buscarAlunosPorNome(String nome){
        return repository.findByNome(nome);
    }
    public Optional<Aluno> buscarAlunoPorId(Integer id){
        return repository.findById(id);
    }
    public Aluno salvar(Aluno aluno){ return repository.save(aluno); }
    public void deletar(Integer id){ repository.deleteById(id); }
}
