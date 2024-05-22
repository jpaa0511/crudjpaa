package com.reto12.crudjpaa.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String nombre;
    private int edad;
    private String ocupacion;

    @ManyToMany
    @JoinTable(
            name = "persona_lugar",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "lugar_id")
    )
    private List<Lugar> lugares;
}
