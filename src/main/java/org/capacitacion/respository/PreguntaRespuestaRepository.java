package org.capacitacion.respository;

import org.capacitacion.entidad.PreguntaRespuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRespuestaRepository extends JpaRepository<PreguntaRespuesta, Long> {
}
