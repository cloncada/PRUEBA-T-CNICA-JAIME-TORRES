package com.example.pruebatecnica.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "Artistas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Artistas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Artista implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TIPO_IDE")
    private String tipoIde;
    @Column(name = "NUMERO_IDE")
    private String numeroIde;
    @Column(name = "NOMBRES")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellido;
   @JsonManagedReference
    @OneToMany(targetEntity = Obra.class)

    private Set<Obra> items;





}
