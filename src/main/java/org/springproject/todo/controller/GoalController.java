package org.springproject.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;
import org.springproject.todo.model.Priority;
import org.springproject.todo.service.GoalService;
import org.springproject.todo.service.GoalServiceImp;


import java.time.LocalDate;
import java.util.List;

@RestController
public class GoalController {

    private final GoalService service;

    public GoalController(GoalServiceImp service){
        this.service = service;
    }


    @GetMapping("/goals")
    public List<Goal> getGoals(){
        return service.getGoals();
    }


    public Goal getGoal(Long id){
        return service.getGoal(id);
    }

    @GetMapping("/creategoal")
    public Goal createGoal(){
        Goal goal = new Goal();
        goal.setCreationDate(LocalDate.now());
        service.createGoal(goal);
        return goal;
    }

    public void updateGoal(GoalDTO goal){
        service.updateGoal(goal.getId(), goal);
    }

    @DeleteMapping("/goals/{id}")
    public void deleteGoal(@PathVariable Long id){
        service.deleteGoal(id);
    }

}
