package org.springproject.todo.controller;


import org.springframework.web.bind.annotation.*;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;
import org.springproject.todo.service.GoalService;
import org.springproject.todo.service.GoalServiceImp;

import java.util.List;

@RestController
public class GoalController {

    private final GoalService service;

    public GoalController(GoalServiceImp service){
        this.service = service;
    }


    @GetMapping("/goals")
    public List<GoalDTO> getGoals(){
        return service.getGoals();
    }

    @GetMapping("/goals/{id}")
    public Goal getGoal(@PathVariable Long id){
        return service.getGoal(id);
    }

    @PostMapping("/goals")
    public GoalDTO createGoal(GoalDTO goal){
        service.createGoal(goal);
        return goal;
    }

    @PatchMapping
    public void updateGoal(GoalDTO goal){
        service.updateGoal(goal);
    }

    @DeleteMapping("/goals/{id}")
    public void deleteGoal(@PathVariable Long id){
        service.deleteGoal(id);
    }

}
