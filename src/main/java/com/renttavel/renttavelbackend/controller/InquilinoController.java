package com.renttavel.renttavelbackend.controller;

import com.renttavel.renttavelbackend.model.entity.Inquilino;
import com.renttavel.renttavelbackend.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/inquilino")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class InquilinoController {

    @Autowired
    private InquilinoService inquilinoService;

    @GetMapping
    public List<Inquilino> findAll() {
        return inquilinoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Inquilino findById(@PathVariable Long id) {
        return inquilinoService.findById(id);
    }

    @PostMapping
    public Inquilino create(@RequestBody Inquilino inquilino) {
        return inquilinoService.save(inquilino);
    }

    @PutMapping
    public Inquilino update(@RequestBody Inquilino inquilino) {
        return inquilinoService.update(inquilino);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return inquilinoService.delete(id);
    }
}
