package com.example.pruebatecnica.service;


import com.example.pruebatecnica.entity.Artista;
import com.example.pruebatecnica.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepository artistaRepository;
    public Artista getArtistaById(Long id){

        return artistaRepository.getById(id);
    }

}
