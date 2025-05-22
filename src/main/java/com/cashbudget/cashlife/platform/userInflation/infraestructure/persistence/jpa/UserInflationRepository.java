package com.cashbudget.cashlife.platform.userInflation.infraestructure.persistence.jpa;

import com.cashbudget.cashlife.platform.userInflation.domain.model.UserInflation;
import com.cashbudget.cashlife.platform.userInflation.domain.model.UserInflationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInflationRepository extends JpaRepository<UserInflation, UserInflationId> {
}
