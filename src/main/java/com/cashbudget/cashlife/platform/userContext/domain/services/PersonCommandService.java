package com.cashbudget.cashlife.platform.userContext.domain.services;

import com.cashbudget.cashlife.platform.userContext.domain.model.aggregates.Person;
import com.cashbudget.cashlife.platform.userContext.domain.model.commands.CreatePersonCommand;

import java.util.Optional;

public interface PersonCommandService {
    Optional<Person> handle(CreatePersonCommand command);
}
