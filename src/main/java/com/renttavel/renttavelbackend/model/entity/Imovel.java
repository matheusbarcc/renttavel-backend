package com.renttavel.renttavelbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private int tipo;
    private int capacidadePessoas;
    private int qtdQuarto;
    private int qtdCama;
    private int qtdBanheiro;
    private boolean isOcupado;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_anfitriao")
    private Anfitriao anfitriao;
}
