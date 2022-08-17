package com.banklineapi.controllers;

import com.banklineapi.dto.NovaMovimentacao;
import com.banklineapi.model.Movimentacao;
import com.banklineapi.repository.MovimentacaoRepository;
import com.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;
    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }
@PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }

}
