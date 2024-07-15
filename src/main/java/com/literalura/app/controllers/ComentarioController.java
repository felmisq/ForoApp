package com.literalura.app.controllers;

import com.literalura.app.models.Comentario;
import com.literalura.app.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioController(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    @GetMapping("/listar")
    public List<Comentario> listarTemas() {
        return comentarioRepository.findAll();
    }

    @PostMapping("/agregar")
    public Comentario crearComentario(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @GetMapping("/buscar/{id}")
    public Comentario obtenerComentario(@PathVariable Long id) {
        return comentarioRepository.findById(id).orElse(null);
    }

    @PutMapping("/editar/{id}")
    public Comentario actualizarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        Comentario comentarioExistente = comentarioRepository.findById(id).orElse(null);
        if (comentarioExistente != null) {
            comentarioExistente.setContenido(comentario.getContenido());
            comentarioExistente.setFechaDePublicacion(comentario.getFechaDePublicacion());
            comentarioExistente.setTema(comentario.getTema());
            comentarioExistente.setUsuario(comentario.getUsuario());
            return comentarioRepository.save(comentarioExistente);
        } else {
            return null;
        }
    }
}
