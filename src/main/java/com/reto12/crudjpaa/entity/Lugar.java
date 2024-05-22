package com.reto12.crudjpaa.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_Lugar")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLugar;

    private String nombre;
    private String departamento;
    private String pais;

    @ManyToMany(mappedBy = "lugares")
    private List<Persona> personas;
}
