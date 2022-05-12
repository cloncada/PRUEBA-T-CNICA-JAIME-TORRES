package com.example.pruebatecnica.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Museos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "obras"})
public class Museo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name="NOMBRE")
    private String nombre;
    @Column(name="PAIS")
    private String pais;
    @Column(name="CIUDAD")
    private String ciudad;
    @Column(name="DIRECCION")
    private String direccion;
    @JsonManagedReference
    @ManyToMany(mappedBy = "museos")
    public List<Obra> obras = new ArrayList<>();





}
