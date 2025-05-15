package com.cashbudget.cashlife.platform.iam.interfaces.rest.transform;

import com.cashbudget.cashlife.platform.iam.domain.model.entities.Role;
import com.cashbudget.cashlife.platform.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}