package com.gmail.burinigor7.moderationservice.service;

import com.gmail.burinigor7.moderationservice.internalcalls.CrudServiceApiClient;
import com.gmail.burinigor7.moderationservice.model.FundraisingProject;
import com.gmail.burinigor7.moderationservice.model.FundraisingProjectStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundraisingProjectService {
    private final CrudServiceApiClient crudServiceApiClient;

    @Autowired
    public FundraisingProjectService(CrudServiceApiClient crudServiceApiClient) {
        this.crudServiceApiClient = crudServiceApiClient;
    }

    public FundraisingProject fundraisingProject(Long id) {
        return crudServiceApiClient.getFundraisingProjectById(id);
    }

    public List<FundraisingProject> getFundraisingProjectByStatus(FundraisingProjectStatus status) {
        return crudServiceApiClient.getFundraisingProjectByStatus(status);
    }
}
