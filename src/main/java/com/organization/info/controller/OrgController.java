package com.organization.info.controller;

import com.organization.info.request.OrganizationRequest;
import com.organization.info.service.OrgService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrgController {
    private final OrgService orgService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody OrganizationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orgService.save(request));
    }

    @GetMapping()
    public ResponseEntity<?> getOrganizations() {
        return ResponseEntity.ok(orgService.getAllOrganization());
    }

    @GetMapping("/{organizationId}")
    public ResponseEntity<?> getOrgById(@PathVariable Long organizationId) {
        return ResponseEntity.ok(orgService.getOrganizationById(organizationId));
    }
}
