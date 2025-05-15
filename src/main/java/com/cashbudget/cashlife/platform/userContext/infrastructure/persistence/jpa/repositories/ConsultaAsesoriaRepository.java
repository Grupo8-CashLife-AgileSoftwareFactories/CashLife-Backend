package com.cashbudget.cashlife.platform.userContext.infrastructure.persistence.jpa.repositories;

import com.cashbudget.cashlife.platform.userContext.domain.model.entities.ConsultaAsesoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ConsultaAsesoriaRepository extends JpaRepository<ConsultaAsesoria, Long> {
}
