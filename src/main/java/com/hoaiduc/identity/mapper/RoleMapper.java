package com.hoaiduc.identity.mapper;

import com.hoaiduc.identity.dto.request.PermissionRequest;
import com.hoaiduc.identity.dto.request.RoleRequest;
import com.hoaiduc.identity.dto.response.PermissionResponse;
import com.hoaiduc.identity.dto.response.RoleResponse;
import com.hoaiduc.identity.entity.Permission;
import com.hoaiduc.identity.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions" , ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
