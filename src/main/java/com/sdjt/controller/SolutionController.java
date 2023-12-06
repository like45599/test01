package com.sdjt.controller;


import com.sdjt.pojo.Plan;
import com.sdjt.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solutions")
public class SolutionController {

    private final PlanService planService;

    @Autowired
    public SolutionController(PlanService planService) {
        this.planService = planService;
    }

    @PostMapping
    public ResponseEntity<List<Plan>> submitQuestion(@RequestBody String question) {
        List<Plan> plans = planService.processQuestion(question);
        return ResponseEntity.ok(plans);
    }
}
