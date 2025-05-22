package com.cashbudget.cashlife.platform.finantialEducation.infrastructure.persistence.jpa;

import com.cashbudget.cashlife.platform.finantialEducation.domain.model.entities.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntasRepository extends JpaRepository<Preguntas, Long> {
}
