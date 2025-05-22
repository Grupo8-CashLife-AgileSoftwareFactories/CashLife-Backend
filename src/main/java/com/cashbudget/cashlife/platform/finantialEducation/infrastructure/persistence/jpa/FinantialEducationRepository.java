package com.cashbudget.cashlife.platform.finantialEducation.infrastructure.persistence.jpa;

import com.cashbudget.cashlife.platform.finantialEducation.domain.model.aggregates.FinantialEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinantialEducationRepository extends JpaRepository<FinantialEducation, Long> {
}
