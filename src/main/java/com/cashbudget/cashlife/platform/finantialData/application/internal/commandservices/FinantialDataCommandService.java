package com.cashbudget.cashlife.platform.finantialData.application.internal.commandservices;

import com.cashbudget.cashlife.platform.finantialData.domain.model.FinantialData;
import com.cashbudget.cashlife.platform.finantialData.infrastructure.persistence.jpa.FinantialDataRepository;
import org.springframework.stereotype.Service;

@Service
public class FinantialDataCommandService {

    private final FinantialDataRepository repository;

    public FinantialDataCommandService(FinantialDataRepository repository) {
        this.repository = repository;
    }

    public FinantialData save(FinantialData finantialData) {
        return repository.save(finantialData);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
