package com.cashbudget.cashlife.platform.iam.domain.services;

import com.cashbudget.cashlife.platform.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
