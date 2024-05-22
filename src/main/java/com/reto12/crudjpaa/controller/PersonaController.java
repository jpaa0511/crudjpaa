package com.reto12.crudjpaa.controller;

import com.reto12.crudjpaa.entity.Persona;
import com.reto12.crudjpaa.services.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/persona")
public class PersonaController {

    @Autowired
    private final PersonaServices personaServices;

    public PersonaController(PersonaServices personaServices) {
        this.personaServices = personaServices;
    }

    @GetMapping
    public List<Persona> getPersonas() {
        return personaServices.getPersonas();
    }

    @GetMapping("/{IdPersona}")
    public Optional<Persona> getPersonaById(@PathVariable("IdPersona") Long IdPersona) {
        return personaServices.getPersonaById(IdPersona);
    }

    @PostMapping
    public void savePersona(@RequestBody Persona persona) {
        personaServices.savePersona(persona);
    }

    @DeleteMapping("/{IdPersona}")
    public void removePersonaById(@PathVariable("IdPersona") Long IdPersona) {
        personaServices.deletePersona(IdPersona);
    }

    @GetMapping("/lugar/{IdLugar}")
    public List<Persona> getPersonasByLugar(@PathVariable("IdLugar") Long IdLugar) {
        return personaServices.getPersonasByLugar(IdLugar);
    }
}
