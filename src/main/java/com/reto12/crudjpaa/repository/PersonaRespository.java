package com.reto12.crudjpaa.repository;

import com.reto12.crudjpaa.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRespository extends JpaRepository<Persona,Long> {


}
