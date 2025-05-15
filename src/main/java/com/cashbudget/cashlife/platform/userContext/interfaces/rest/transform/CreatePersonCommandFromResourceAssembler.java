package com.cashbudget.cashlife.platform.userContext.interfaces.rest.transform;

import com.cashbudget.cashlife.platform.userContext.domain.model.commands.CreatePersonCommand;
import com.cashbudget.cashlife.platform.userContext.interfaces.rest.resources.CreatePersonResource;

public class CreatePersonCommandFromResourceAssembler {
    public static CreatePersonCommand toCommandFromResource(CreatePersonResource resource) {
        return new CreatePersonCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email(),
                resource.street(),
                resource.number());
    }
}
