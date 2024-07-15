package com.literalura.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.app.models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{

}