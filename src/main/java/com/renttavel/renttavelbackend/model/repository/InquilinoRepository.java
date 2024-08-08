package com.renttavel.renttavelbackend.model.repository;

import com.renttavel.renttavelbackend.model.entity.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquilinoRepository extends JpaRepository<Inquilino, Long> {
}
