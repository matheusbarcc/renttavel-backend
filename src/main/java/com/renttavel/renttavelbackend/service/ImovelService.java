package com.renttavel.renttavelbackend.service;

import com.renttavel.renttavelbackend.model.entity.Imovel;
import com.renttavel.renttavelbackend.model.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> findAll() {
        return imovelRepository.findAll();
    }

    public Imovel findById(Long id) {
        return imovelRepository.findById(id).get();
    }

    public Imovel save(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public Imovel update(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public boolean delete(Long id) {
        imovelRepository.deleteById(id);
        return true;
    }
}
