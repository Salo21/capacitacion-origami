package org.capacitacion.resource;

import org.capacitacion.entidad.PreguntaRespuesta;
import org.capacitacion.services.PreguntaRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PreguntaRespuestaResource {
    @Autowired
    private PreguntaRespuestaService preguntaRespuestaService;

    @GetMapping("/preguntasRespuestas")
    public ResponseEntity<?> getPreguntasRespuestas() {
        return ResponseEntity.ok(preguntaRespuestaService.findAll());
    }

}
