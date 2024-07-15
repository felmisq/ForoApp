package com.literalura.app.controllers;

import com.literalura.app.models.Tema;
import com.literalura.app.repositories.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/temas")
public class TemaController {

    private final TemaRepository temaRepository;

    @Autowired
    public TemaController(TemaRepository temaRepository) {
        this.temaRepository = temaRepository;
    }

    @GetMapping("/listar")
    public List<Tema> listarTemas() {
        return temaRepository.findAll();
    }

    @PostMapping("/agregar")
    public Tema crearTema(@RequestBody Tema tema) {
        return temaRepository.save(tema);
    }

    @GetMapping("/buscar/{id}")
    public Tema obtenerTema(@PathVariable Long id) {
        return temaRepository.findById(id).orElse(null);
    }

    @PutMapping("/editar/{id}")
    public Tema actualizarTema(@PathVariable Long id, @RequestBody Tema tema) {
        Tema temaExistente = temaRepository.findById(id).orElse(null);
        if (temaExistente != null) {
            temaExistente.setTitulo(tema.getTitulo());
            temaExistente.setFechaDeCreacion(tema.getFechaDeCreacion());
            return temaRepository.save(temaExistente);
        } else {
            return null;
        }
    }
}
