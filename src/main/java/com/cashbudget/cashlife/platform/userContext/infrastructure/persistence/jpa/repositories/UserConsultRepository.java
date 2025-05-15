package com.cashbudget.cashlife.platform.userContext.infrastructure.persistence.jpa.repositories;

import com.cashbudget.cashlife.platform.userContext.domain.model.aggregates.UserConsult;
import com.cashbudget.cashlife.platform.userContext.domain.model.aggregates.UserConsultId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConsultRepository extends JpaRepository<UserConsult, UserConsultId> { }

