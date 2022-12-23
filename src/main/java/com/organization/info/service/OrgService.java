package com.organization.info.service;

import java.util.List;

import com.organization.info.dto.OrganizationDTO; 
import com.organization.info.request.OrganizationRequest;

public interface OrgService{

	// create organization
	OrganizationDTO save(OrganizationRequest organizationRequest);
	
	// Update organization
	OrganizationDTO update(OrganizationRequest organizationRequest, Long organizationId);
	
	// Delete Organization
	void delete(Long organizationId);
	
	// Get single organization 
	OrganizationDTO getOrganizationById(Long organizationId);
	
	// Get All organization
	List<OrganizationDTO> getAllOrganization();
}
