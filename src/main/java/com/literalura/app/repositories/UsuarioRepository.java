package com.literalura.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}