package org.capacitacion.respository;

import org.capacitacion.entidad.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository  extends JpaRepository<Pregunta, Long> {
}
