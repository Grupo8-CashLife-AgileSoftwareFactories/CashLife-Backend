package com.cashbudget.cashlife.platform.userTransaction.application.internal.queryservices;

import com.cashbudget.cashlife.platform.userTransaction.domain.model.aggregates.Transaction;
import com.cashbudget.cashlife.platform.userTransaction.infrastructure.persistence.jpa.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionQueryServiceImpl {
    private final TransactionRepository transactionRepository;

    public TransactionQueryServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getTransactionsByUser(String userId) {
        return transactionRepository.findByUserId(userId);
    }
}
