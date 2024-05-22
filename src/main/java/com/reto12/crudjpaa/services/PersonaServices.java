package com.reto12.crudjpaa.services;

import com.reto12.crudjpaa.entity.Persona;
import com.reto12.crudjpaa.repository.PersonaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServices {

    @Autowired
    private PersonaRespository personaRespository;

    public List<Persona> getPersonas() {
        return personaRespository.findAll();
    }

    public Optional<Persona> getPersonaById(Long id) {
        return personaRespository.findById(id);
    }

    public void savePersona(Persona persona) {
        personaRespository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRespository.deleteById(id);
    }

    public List<Persona> getPersonasByLugar(Long lugarId) {
        return personaRespository.findAll().stream()
                .filter(persona -> persona.getLugares().stream()
                        .anyMatch(lugar -> lugar.getIdLugar().equals(lugarId)))
                .collect(Collectors.toList());
    }
}
