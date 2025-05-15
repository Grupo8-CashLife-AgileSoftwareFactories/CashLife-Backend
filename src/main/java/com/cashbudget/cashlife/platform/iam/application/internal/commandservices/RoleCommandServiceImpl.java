package com.cashbudget.cashlife.platform.iam.application.internal.commandservices;

import com.cashbudget.cashlife.platform.iam.domain.model.commands.SeedRolesCommand;
import com.cashbudget.cashlife.platform.iam.domain.model.entities.Role;
import com.cashbudget.cashlife.platform.iam.domain.model.valueobjects.Roles;
import com.cashbudget.cashlife.platform.iam.domain.services.RoleCommandService;
import com.cashbudget.cashlife.platform.iam.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RoleCommandServiceImpl implements RoleCommandService {

    private final RoleRepository roleRepository;

    public RoleCommandServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void handle(SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(
                role -> {
                    if (!roleRepository.existsByName(role)) {
                        roleRepository.save(new Role(Roles.valueOf(role.name())));
                    }
                }
        );
    }
}
