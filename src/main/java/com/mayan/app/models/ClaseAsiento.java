package com.mayan.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clases_asientos")
@Data
public class ClaseAsiento {

    @Id
    @Column(name = "id_clase_asiento")
    private int idClase;
    private String nombre;

}
