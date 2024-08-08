package com.renttavel.renttavelbackend.service;

import com.renttavel.renttavelbackend.model.entity.Aluguel;
import com.renttavel.renttavelbackend.model.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public List<Aluguel> findAll() {
        return aluguelRepository.findAll();
    }

    public Aluguel findById(Long id) {
        return aluguelRepository.findById(id).get();
    }

    public Aluguel save(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel update(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public boolean delete(Long id) {
        aluguelRepository.deleteById(id);
        return true;
    }
}
