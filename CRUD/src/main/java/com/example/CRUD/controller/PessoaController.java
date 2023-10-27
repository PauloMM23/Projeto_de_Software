package com.example.CRUD.controller;

import com.example.CRUD.model.Pessoa;
import com.example.CRUD.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller//Isso significa que esta classe é uma controller
@RequestMapping(path = "/pessoa")//mapping que acessa esta classe
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;
    @GetMapping(path = "/cadastrar")
    public String cadastrarPessoa(Model model){
        //mandar um objeto do tipo Pessoa para a pagina cadastro
        model.addAttribute("pessoa", new Pessoa());
        //redirecionar para a pagina cadastrarPessoa.html
        return "cadastrarPessoa";
    }
    @PostMapping("/save")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa, Model model){
        //salvando um individuo no banco de dados
        pessoaRepository.save(pessoa);
        return listarPessoa(pessoa, model);
    }

    @GetMapping("/listar")
    public String listarPessoa(@ModelAttribute Pessoa pessoa, Model model){
        List<Pessoa> listaPessoa = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("pessoas", listaPessoa);
        return "ListaPessoas";
    }
}
