package com.literalura.app.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    @Column(name = "contenido", nullable = false)
    private String contenido;

    @Column(name = "fechaDePublicacion", nullable = false)
    private LocalDate fechaDePublicacion;

    @ManyToOne
    @JoinColumn(name = "Idtema", referencedColumnName = "Idtema")
    private Tema tema;

    @ManyToOne
    @JoinColumn(name = "Idusuario", referencedColumnName = "Idusuario")
    private Usuario usuario;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}