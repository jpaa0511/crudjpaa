package com.reto12.crudjpaa.services;

import com.reto12.crudjpaa.entity.Lugar;
import com.reto12.crudjpaa.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LugarServices {

    @Autowired
    private LugarRepository lugarRepository;

    public List<Lugar> getLugares() {
        return lugarRepository.findAll();
    }

    public Optional<Lugar> getLugarById(Long id) {
        return lugarRepository.findById(id);
    }

    public void saveLugar(Lugar lugar) {
        lugarRepository.save(lugar);
    }

    public void deleteLugar(Long id) {
        lugarRepository.deleteById(id);
    }

    public List<Lugar> getLugaresByPais(String pais) {
        return lugarRepository.findByPais(pais);
    }
}
