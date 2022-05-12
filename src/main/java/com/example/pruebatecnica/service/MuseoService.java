package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entity.Museo;
import com.example.pruebatecnica.repository.MuseoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuseoService {
    @Autowired
    MuseoRepository museoRepository;
   public List <Museo> findByCiudadAndStartsWithL(String ciudad, String letra){
        List<Museo> museos=museoRepository.findMuseoByCiudad(ciudad);
        for(int i=0;i <museos.size();i++){
            if(!museos.get(i).getNombre().startsWith(letra)){
                museos.remove(i);

            }


        }
return museos;

    }

}
