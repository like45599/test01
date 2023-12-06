package com.sdjt.service;

import com.sdjt.pojo.Plan;

import java.util.List;

public interface PlanService {
    List<Plan> processQuestion(String question);
}
