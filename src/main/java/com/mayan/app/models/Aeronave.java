package com.mayan.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "aeronaves")
@Data
public class Aeronave {

    @Id
    @Column(name = "id_aeronave")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAeronave;
    private String modelo;
    private int capacidad;

}
