package com.renttavel.renttavelbackend.service;

import com.renttavel.renttavelbackend.model.entity.Inquilino;
import com.renttavel.renttavelbackend.model.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquilinoService {

    @Autowired
    private InquilinoRepository inquilinoRepository;

    public List<Inquilino> findAll() {
        return inquilinoRepository.findAll();
    }

    public Inquilino findById(Long id) {
        return inquilinoRepository.findById(id).get();
    }

    public Inquilino save(Inquilino inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    public Inquilino update(Inquilino inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    public boolean delete(Long id) {
        inquilinoRepository.deleteById(id);
        return true;
    }
}
