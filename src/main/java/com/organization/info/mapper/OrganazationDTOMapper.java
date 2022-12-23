package com.organization.info.mapper;

import com.organization.info.dto.OrganizationDTO;
import com.organization.info.entity.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganazationDTOMapper extends EntityMapper<Organization, OrganizationDTO>{

}
