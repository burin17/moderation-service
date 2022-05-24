package com.gmail.burinigor7.moderationservice.service;

import com.gmail.burinigor7.moderationservice.internalcalls.CrudServiceApiClient;
import com.gmail.burinigor7.moderationservice.model.FundraisingProject;
import com.gmail.burinigor7.moderationservice.model.FundraisingProjectStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModerationService {
    private final CrudServiceApiClient crudServiceApiClient;

    @Autowired
    public ModerationService(CrudServiceApiClient crudServiceApiClient) {
        this.crudServiceApiClient = crudServiceApiClient;
    }

    public FundraisingProject moderate(Long fpId, boolean isValid) {
        FundraisingProject fundraisingProject = crudServiceApiClient.getFundraisingProjectById(fpId);
        if (isValid) {
            fundraisingProject.setStatus(FundraisingProjectStatus.APPROVED);
        } else {
            fundraisingProject.setStatus(FundraisingProjectStatus.REJECTED);
        }
        return crudServiceApiClient.updateFundraisingProject(fundraisingProject);
    }

    public FundraisingProject block(Long fpId) {
        FundraisingProject fundraisingProject = crudServiceApiClient.getFundraisingProjectById(fpId);
        fundraisingProject.setStatus(FundraisingProjectStatus.BLOCKED);
        return crudServiceApiClient.updateFundraisingProject(fundraisingProject);
    }
}
