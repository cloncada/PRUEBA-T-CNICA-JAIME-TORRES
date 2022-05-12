package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.Obra;
import com.example.pruebatecnica.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ObraController {
    @Autowired
    ObraRepository obraRepository;
    @PostMapping("/createObra")
    public void createObra(@RequestBody Obra obra){

        obraRepository.save(obra);
    }
    @GetMapping("/getObras")
    public List<Obra> getObras(){
        return obraRepository.findAll();
    }
}
