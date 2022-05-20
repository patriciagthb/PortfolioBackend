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
@Table(name="experiencia")
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="empresa")
    private String empresa;
    @Column(name="puesto")
    private String puesto;
    @Column(name="desde")
    private String desde;
    @Column(name="hasta")
    private String hasta;
    @Column(name="ubicacion")
    private String ubicacion;
    @Column(name="logo")
    private String logo;    
    
    
}
