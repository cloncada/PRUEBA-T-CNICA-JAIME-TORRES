package com.example.pruebatecnica.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.util.Lazy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Obras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "museos"})
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "PAIS")
    private String pais;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="id_artista", nullable=false)
    private Artista artista;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "Museos_x_Obras",
            joinColumns = { @JoinColumn(name = "obra_id") },
            inverseJoinColumns = { @JoinColumn(name = "museo_id") })
    private List<Museo> museos = new ArrayList<>();


}
