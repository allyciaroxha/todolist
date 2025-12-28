package br.com.allyciaroxha.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller criar estrutura q tenha (retorne) paginas flexibilidade em retornar mais q um obj
@RestController //estamos construindo uma api (é um controller mas ja com os conceitos que uma api rest precisa ter)
@RequestMapping("/primeiraRota")
public class PrimeiraController {

    /**
     * Métodos de acesso do HTTP!
     * 
     * GET - buscar uma informação
     * POST - adicionar dado/informação
     * PUT - alterar um dado/info
     * DELETE - remover um dado
     * PATCH - alterar somente uma parte da info/dado
     * 
     */
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}