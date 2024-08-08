package com.renttavel.renttavelbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataCheckin;
    private LocalDateTime dataCheckoutPrevisto;
    private LocalDateTime dataCheckoutEfetivo;
    private double valorTotal;
    private double valorDiaria;
    private double valorLimpeza;
    private double valorMulta;
    private int qtdDias;

    @ManyToOne
    @JoinColumn(name = "id_imovel")
    private Imovel imovel;

    @ManyToOne
    @JoinColumn(name = "id_inquilino")
    private Inquilino inquilino;

    @ManyToOne
    @JoinColumn(name = "id_anfitriao")
    private Anfitriao anfitriao;
}
