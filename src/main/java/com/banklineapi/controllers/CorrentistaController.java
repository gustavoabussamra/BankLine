package com.banklineapi.controllers;

import com.banklineapi.dto.NovoCorrentista;
import com.banklineapi.model.Correntista;
import com.banklineapi.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.banklineapi.repository.CorrentistaRepository;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;
    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }
@PostMapping
    public void save(@RequestBody NovoCorrentista correntista) {
        service.save(correntista);
    }

}
