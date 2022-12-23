package com.organization.info.service.impl;

import com.organization.info.dto.OrganizationDTO;
import com.organization.info.entity.Organization;
import com.organization.info.exception.ResourceNotFoundException;
import com.organization.info.mapper.OrganazationDTOMapper;
import com.organization.info.mapper.OrganazationRequestMapper;
import com.organization.info.repository.OrgRepository;
import com.organization.info.request.OrganizationRequest;
import com.organization.info.service.OrgService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrgServiceImpl implements OrgService {


    private final OrgRepository orgRepository;
    private final OrganazationRequestMapper requestMapper;
    private final OrganazationDTOMapper dtoMapper;

    @Override
    public OrganizationDTO save(OrganizationRequest organizationRequest) {
        Organization organization = requestMapper.toEntity(organizationRequest);
        Organization save = orgRepository.save(organization);
        return dtoMapper.toDTO(save);
    }

    @Override
    public OrganizationDTO update(OrganizationRequest organizationRequest, Long organizationId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long organizationId) {
        // TODO Auto-generated method stub

    }

    @Override
    public OrganizationDTO getOrganizationById(Long organizationId) {
        Organization organization = orgRepository.findById(organizationId).orElseThrow(() -> new ResourceNotFoundException("Not found. Please try again..!!"));
        return dtoMapper.toDTO(organization);
    }

    @Override
    public List<OrganizationDTO> getAllOrganization() {
        return dtoMapper.toDTOList(orgRepository.findAll());
    }
}
