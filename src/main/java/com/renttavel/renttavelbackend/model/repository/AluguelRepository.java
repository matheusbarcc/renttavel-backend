package com.renttavel.renttavelbackend.model.repository;

import com.renttavel.renttavelbackend.model.entity.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}
