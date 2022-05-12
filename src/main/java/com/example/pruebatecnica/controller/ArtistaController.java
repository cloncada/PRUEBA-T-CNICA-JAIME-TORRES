package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Artista;
import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;
import com.example.pruebatecnica.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtistaController {
    @Autowired
    ArtistaService artistaService;

    @GetMapping("/artistas/{id}")
    public Artista getArtistaById(@PathVariable Long id) {

        return artistaService.getArtistaById(id);
    }

    @GetMapping("/obras/{id}")
    public List<Obra> getObrasByArtistaById(@PathVariable Long id) {
        Artista artistaa = artistaService.getArtistaById(id);
        List<Obra> obras = artistaa.getItems();
        List<Obra> filtObras = new ArrayList<>();
        for (int i = 0; i < obras.size(); i++) {
            List<Museo> museos = obras.get(i).getMuseos();
            for (int j = 0; j < museos.size(); i++) {
                if (museos.get(j).getPais().equals("Colombia")) {

                    filtObras.add(obras.get(i));
                }

            }


        }

        return filtObras;
    }
}
