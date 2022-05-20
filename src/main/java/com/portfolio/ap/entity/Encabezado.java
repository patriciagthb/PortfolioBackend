package com.portfolio.ap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="encabezado")
public class Encabezado {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="fotoperfil")
    private String fotoperfil;
    @Column(name="titulo")
    private String titulo;
    @Column(name="ubicacion")
    private String ubicacion;
   
   
    
}
