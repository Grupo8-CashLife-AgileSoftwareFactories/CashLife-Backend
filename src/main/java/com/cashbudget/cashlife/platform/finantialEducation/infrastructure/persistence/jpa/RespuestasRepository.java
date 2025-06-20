package com.cashbudget.cashlife.platform.finantialEducation.infrastructure.persistence.jpa;

import com.cashbudget.cashlife.platform.finantialEducation.domain.model.entities.Respuestas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestasRepository extends JpaRepository<Respuestas, Long> {
}
