package com.literalura.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.app.models.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}