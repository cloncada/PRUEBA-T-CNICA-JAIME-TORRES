package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ObraRepository extends JpaRepository<Obra,Long> {

    List<Obra> findAll();


}
