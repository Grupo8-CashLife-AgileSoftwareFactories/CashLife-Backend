package com.cashbudget.cashlife.platform.userTransaction.infrastructure.persistence.jpa.repositories;

import com.cashbudget.cashlife.platform.userTransaction.domain.model.aggregates.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(String userId); // Encuentra transacciones por userId
}
