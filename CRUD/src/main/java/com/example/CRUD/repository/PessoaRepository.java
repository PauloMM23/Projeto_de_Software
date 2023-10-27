package com.example.CRUD.repository;

import com.example.CRUD.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

//CRUD - Create, Read, Update e Delete da classe Pessoa
public interface PessoaRepository extends CrudRepository <Pessoa, Integer> {
}
