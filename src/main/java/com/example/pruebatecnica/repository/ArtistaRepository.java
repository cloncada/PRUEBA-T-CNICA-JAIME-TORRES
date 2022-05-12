package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {


}
