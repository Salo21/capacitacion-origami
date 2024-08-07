package org.capacitacion.resource;

import org.capacitacion.dto.PreguntaDto;
import org.capacitacion.mappers.PreguntaMapper;
import org.capacitacion.respository.PreguntaRepository;
import org.capacitacion.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PreguntaResource {
    @Autowired
    private PreguntaService preguntaService;
    @GetMapping("/preguntas")
    public ResponseEntity<?> getPregunta(){
        return ResponseEntity.ok(preguntaService.findAll());
    }
}
