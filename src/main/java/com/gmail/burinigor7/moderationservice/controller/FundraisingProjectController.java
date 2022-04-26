package com.gmail.burinigor7.moderationservice.controller;

import com.gmail.burinigor7.moderationservice.model.FundraisingProject;
import com.gmail.burinigor7.moderationservice.model.FundraisingProjectStatus;
import com.gmail.burinigor7.moderationservice.service.FundraisingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moderation/fundraising-projects")
public class FundraisingProjectController {
    private final FundraisingProjectService fundraisingProjectService;

    @Autowired
    public FundraisingProjectController(FundraisingProjectService fundraisingProjectService) {
        this.fundraisingProjectService = fundraisingProjectService;
    }

    @GetMapping("{fundraisingProjectId}")
    public FundraisingProject fundraisingProject(@PathVariable Long fundraisingProjectId) {
        return fundraisingProjectService.fundraisingProject(fundraisingProjectId);
    }

    @GetMapping("/status")
    public List<FundraisingProject> fundraisingProjectByStatus(@RequestParam FundraisingProjectStatus status) {
        return fundraisingProjectService.getFundraisingProjectByStatus(status);
    }
}
