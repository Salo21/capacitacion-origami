package org.capacitacion.services;

import org.capacitacion.dto.PreguntaDto;
import org.capacitacion.dto.PreguntaRespuestaDto;
import org.capacitacion.entidad.Pregunta;
import org.capacitacion.entidad.PreguntaRespuesta;
import org.capacitacion.mappers.PreguntaRespuestaMapper;
import org.capacitacion.respository.PreguntaRespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PreguntaRespuestaService {
    @Autowired
    private PreguntaRespuestaRepository preguntaRespuestaRepository;
    @Autowired
    private PreguntaRespuestaMapper preguntaRespuestaMapper;

    public List<PreguntaRespuestaDto> findAll(){

        List<PreguntaRespuestaDto> list = preguntaRespuestaMapper.toDto(preguntaRespuestaRepository.findAll());
        return list;
    }

    public PreguntaRespuestaDto guardarPreguntaRespuesta(PreguntaRespuestaDto preguntaRespuestaDto){
        PreguntaRespuesta preguntaRespuesta = preguntaRespuestaMapper.toEntity( preguntaRespuestaDto);
        if(preguntaRespuesta.getFechaRegistro() == null){
            preguntaRespuesta.setFechaRegistro(new Date());
        }
        preguntaRespuesta = preguntaRespuestaRepository.save(preguntaRespuesta);
        return preguntaRespuestaMapper.toDto(preguntaRespuesta);

    }
}
