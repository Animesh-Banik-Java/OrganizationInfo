package com.organization.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.info.entity.Organization;

public interface OrgRepository extends JpaRepository<Organization, Long> {
}
