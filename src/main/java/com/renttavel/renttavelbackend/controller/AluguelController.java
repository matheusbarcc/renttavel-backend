package com.renttavel.renttavelbackend.controller;

import com.renttavel.renttavelbackend.model.entity.Aluguel;
import com.renttavel.renttavelbackend.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/aluguel")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;

    @GetMapping
    public List<Aluguel> findAll() {
        return aluguelService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Aluguel findById(@PathVariable Long id) {
        return aluguelService.findById(id);
    }

    @PostMapping
    public Aluguel save(@RequestBody Aluguel aluguel) {
        return aluguelService.save(aluguel);
    }

    @PutMapping
    public Aluguel update(@RequestBody Aluguel aluguel) {
        return aluguelService.update(aluguel);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return aluguelService.delete(id);
    }
}
