package com.cashbudget.cashlife.platform.finantialEducation.aplication.internal.commandservices;

import com.cashbudget.cashlife.platform.finantialEducation.domain.model.aggregates.FinantialEducation;
import com.cashbudget.cashlife.platform.finantialEducation.infrastructure.persistence.jpa.FinantialEducationRepository;
import org.springframework.stereotype.Service;

@Service
public class FinantialEducationCommandService {

    private final FinantialEducationRepository repository;

    public FinantialEducationCommandService(FinantialEducationRepository repository) {
        this.repository = repository;
    }

    public FinantialEducation save(FinantialEducation finantialEducation) {
        return repository.save(finantialEducation);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
