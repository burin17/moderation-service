package com.gmail.burinigor7.moderationservice.controller;

import com.gmail.burinigor7.moderationservice.model.FundraisingProject;
import com.gmail.burinigor7.moderationservice.service.ModerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moderation")
public class ModerationController {
    private final ModerationService moderationService;

    @Autowired
    public ModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @PostMapping("/{fpId}")
    public FundraisingProject moderate(@PathVariable Long fpId, @RequestParam boolean isValid) {
        return moderationService.moderate(fpId, isValid);
    }
}
