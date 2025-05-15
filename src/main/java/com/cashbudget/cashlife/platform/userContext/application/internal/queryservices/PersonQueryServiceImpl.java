package com.cashbudget.cashlife.platform.userContext.application.internal.queryservices;

import com.cashbudget.cashlife.platform.userContext.domain.model.aggregates.Person;
import com.cashbudget.cashlife.platform.userContext.domain.model.queries.GetAllPersonsQuery;
import com.cashbudget.cashlife.platform.userContext.domain.model.queries.GetPersonByEmailQuery;
import com.cashbudget.cashlife.platform.userContext.domain.model.queries.GetPersonByIdQuery;
import com.cashbudget.cashlife.platform.userContext.domain.services.PersonQueryService;
import com.cashbudget.cashlife.platform.userContext.infrastructure.persistence.jpa.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonQueryServiceImpl implements PersonQueryService {
    private final PersonRepository personRepository;

    public PersonQueryServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> handle(GetPersonByIdQuery query) {
        return personRepository.findById(query.personId());
    }

    @Override
    public Optional<Person> handle(GetPersonByEmailQuery query) {return personRepository.findByEmail(query.emailAddress());}

    @Override
    public List<Person> handle(GetAllPersonsQuery query) {
        return personRepository.findAll();
    }
}
