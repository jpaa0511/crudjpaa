package com.reto12.crudjpaa.repository;

import com.reto12.crudjpaa.entity.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Long> {
    List<Lugar> findByPais(String pais);
}
