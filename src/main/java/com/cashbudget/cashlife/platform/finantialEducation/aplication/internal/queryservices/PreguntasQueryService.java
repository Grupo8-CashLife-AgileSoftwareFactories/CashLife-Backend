package com.cashbudget.cashlife.platform.finantialEducation.aplication.internal.queryservices;

import com.cashbudget.cashlife.platform.finantialEducation.domain.model.entities.Preguntas;
import com.cashbudget.cashlife.platform.finantialEducation.infrastructure.persistence.jpa.PreguntasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntasQueryService {

    private final PreguntasRepository repository;

    public PreguntasQueryService(PreguntasRepository repository) {
        this.repository = repository;
    }

    public List<Preguntas> findAll() {
        return repository.findAll();
    }

    public Optional<Preguntas> findById(Long id) {
        return repository.findById(id);
    }
}
