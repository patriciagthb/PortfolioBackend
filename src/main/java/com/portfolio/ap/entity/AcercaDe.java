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
@Table(name="acercade")
public class AcercaDe {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column(name="id")
    private int Id;
    @Column(name="acercade")
    private String acercaDe;   
    
    
}
