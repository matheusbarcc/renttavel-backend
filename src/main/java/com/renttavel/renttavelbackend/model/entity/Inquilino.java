package com.renttavel.renttavelbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "id_anfitriao")
    private Anfitriao anfitriao;
}
