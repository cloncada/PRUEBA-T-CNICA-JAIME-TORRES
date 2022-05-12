package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.entity.Obra;
import com.example.pruebatecnica.repository.MuseoRepository;
import com.example.pruebatecnica.service.MuseoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MuseoController {
    @Autowired
    MuseoService museoService;
    @Autowired
    MuseoRepository museoRepository;

    @GetMapping("/lsmuseos/{ciudad}/")
    public List<Museo> lsMuseos(@PathVariable String ciudad){
        return museoService.findByCiudadAndStartsWithL(ciudad,"L");

    }
    @GetMapping("/museos/{id}/")
    public List<Obra>lsObrasByMuseo(@PathVariable Long id){
        return museoRepository.findMuseoById(id).obras;

    }


}
