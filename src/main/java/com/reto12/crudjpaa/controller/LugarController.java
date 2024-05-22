package com.reto12.crudjpaa.controller;

import com.reto12.crudjpaa.entity.Lugar;
import com.reto12.crudjpaa.services.LugarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/lugar")
public class LugarController {

    @Autowired
    private final LugarServices lugarServices;

    public LugarController(LugarServices lugarServices) {
        this.lugarServices = lugarServices;
    }

    @GetMapping
    public List<Lugar> getLugares() {
        return lugarServices.getLugares();
    }

    @GetMapping("/{IdLugar}")
    public Optional<Lugar> getLugarById(@PathVariable("IdLugar") Long IdLugar) {
        return lugarServices.getLugarById(IdLugar);
    }

    @PostMapping
    public void saveLugar(@RequestBody Lugar lugar) {
        lugarServices.saveLugar(lugar);
    }

    @DeleteMapping("/{IdLugar}")
    public void removeLugarById(@PathVariable("IdLugar") Long IdLugar) {
        lugarServices.deleteLugar(IdLugar);
    }

    @GetMapping("/pais/{pais}")
    public List<Lugar> getLugaresByPais(@PathVariable("pais") String pais) {
        return lugarServices.getLugaresByPais(pais);
    }
}
