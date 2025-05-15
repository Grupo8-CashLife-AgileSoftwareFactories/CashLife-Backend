package com.cashbudget.cashlife.platform.userContext.interfaces.rest.resources;

public record PersonResource(Long id,
                             String fullName,
                             String email,
                             String streetAddress) {
}
