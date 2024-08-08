package com.renttavel.renttavelbackend.model.repository;

import com.renttavel.renttavelbackend.model.entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
