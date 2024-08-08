package com.renttavel.renttavelbackend.service;

import com.renttavel.renttavelbackend.model.entity.Anfitriao;
import com.renttavel.renttavelbackend.model.repository.AnfitriaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnfitriaoService {

    @Autowired
    private AnfitriaoRepository anfitriaoRepository;

    public List<Anfitriao> findAll() {
        return anfitriaoRepository.findAll();
    }

    public Anfitriao findById(Long id) {
        return anfitriaoRepository.findById(id).get();
    }

    public Anfitriao save(Anfitriao anfitriao) {
        return anfitriaoRepository.save(anfitriao);
    }

    public Anfitriao update(Anfitriao anfitriao) {
        return anfitriaoRepository.save(anfitriao);
    }

    public boolean delete(Long id) {
        anfitriaoRepository.deleteById(id);
        return true;
    }
}
