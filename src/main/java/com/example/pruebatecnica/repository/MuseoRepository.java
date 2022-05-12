package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MuseoRepository extends JpaRepository<Museo, Long> {

    List<Museo> findMuseoByCiudad(String ciudad);
    Museo findMuseoById(Long id);
}
