package com.renttavel.renttavelbackend.controller;

import com.renttavel.renttavelbackend.model.entity.Endereco;
import com.renttavel.renttavelbackend.model.repository.EnderecoRepository;
import com.renttavel.renttavelbackend.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/endereco")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Endereco findById(@PathVariable Long id) {
        return enderecoService.findById(id);
    }

    @PostMapping
    public Endereco save(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }

    @PutMapping
    public Endereco update(@RequestBody Endereco endereco) {
        return enderecoService.update(endereco);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return enderecoService.delete(id);
    }
}
