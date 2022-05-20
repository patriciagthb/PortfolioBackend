package com.portfolio.ap.repository;

import com.portfolio.ap.entity.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncabezadoRepository extends JpaRepository <Encabezado, Integer>{
    
}
