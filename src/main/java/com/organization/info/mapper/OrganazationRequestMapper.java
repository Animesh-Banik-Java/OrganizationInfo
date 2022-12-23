package com.organization.info.mapper;

import com.organization.info.entity.Organization;
import com.organization.info.request.OrganizationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganazationRequestMapper extends EntityMapper<Organization, OrganizationRequest>{

}
