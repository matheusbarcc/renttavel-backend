package com.renttavel.renttavelbackend.controller;

import com.renttavel.renttavelbackend.model.entity.Anfitriao;
import com.renttavel.renttavelbackend.service.AnfitriaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/anfitriao")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class AnfitriaoController {

    @Autowired
    private AnfitriaoService anfitriaoService;

    @GetMapping
    public List<Anfitriao> findAll() {
        return anfitriaoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Anfitriao findById(@PathVariable Long id) {
        return anfitriaoService.findById(id);
    }

    @PostMapping
    public Anfitriao save(@RequestBody Anfitriao anfitriao) {
        return anfitriaoService.save(anfitriao);
    }

    @PutMapping
    public Anfitriao update(@RequestBody Anfitriao anfitriao) {
        return anfitriaoService.update(anfitriao);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return anfitriaoService.delete(id);
    }
}
