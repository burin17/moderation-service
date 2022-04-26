package com.gmail.burinigor7.moderationservice.internalcalls;

import com.gmail.burinigor7.moderationservice.model.FundraisingProject;
import com.gmail.burinigor7.moderationservice.model.FundraisingProjectStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("crud-service")
public interface CrudServiceApiClient {
    @GetMapping("/api/fundraising-projects/{fundraisingProjectId}")
    FundraisingProject getFundraisingProjectById(@PathVariable Long fundraisingProjectId);

    @PostMapping("/api/fundraising-projects")
    FundraisingProject createFundraisingProject(@RequestBody FundraisingProject fundraisingProject);

    @PutMapping("/api/fundraising-projects")
    FundraisingProject updateFundraisingProject(@RequestBody FundraisingProject fundraisingProject);

    @GetMapping("/api/fundraising-projects/status/{status}")
    List<FundraisingProject> getFundraisingProjectByStatus(@PathVariable FundraisingProjectStatus status);
}
