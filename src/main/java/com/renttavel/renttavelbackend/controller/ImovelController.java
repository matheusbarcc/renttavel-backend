package com.renttavel.renttavelbackend.controller;

import com.renttavel.renttavelbackend.model.entity.Imovel;
import com.renttavel.renttavelbackend.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/imovel")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping
    public List<Imovel> findAll() {
        return imovelService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Imovel findById(@PathVariable Long id) {
        return imovelService.findById(id);
    }

    @PostMapping
    public Imovel save(@RequestBody Imovel imovel) {
        return imovelService.save(imovel);
    }

    @PutMapping
    public Imovel update(@RequestBody Imovel imovel) {
        return imovelService.update(imovel);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return imovelService.delete(id);
    }
}
