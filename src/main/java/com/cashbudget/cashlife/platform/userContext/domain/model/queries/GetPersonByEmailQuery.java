package com.cashbudget.cashlife.platform.userContext.domain.model.queries;

import com.cashbudget.cashlife.platform.userContext.domain.model.valueobjects.EmailAddress;

public record GetPersonByEmailQuery(EmailAddress emailAddress) {
}
