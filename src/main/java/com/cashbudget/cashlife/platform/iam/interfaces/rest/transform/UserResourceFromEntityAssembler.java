package com.cashbudget.cashlife.platform.iam.interfaces.rest.transform;

import com.cashbudget.cashlife.platform.iam.domain.model.aggregates.User;
import com.cashbudget.cashlife.platform.iam.domain.model.entities.Role;
import com.cashbudget.cashlife.platform.iam.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource toResourceFromEntity(User user) {
        var roles = user.getRoles().stream().map(Role::getStringName).toList();
        return new UserResource(user.getId(), user.getUsername(), roles);
    }
}