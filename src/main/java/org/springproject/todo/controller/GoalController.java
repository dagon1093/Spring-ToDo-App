package org.springproject.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springproject.todo.model.Goal;
import org.springproject.todo.model.Priority;
import org.springproject.todo.service.GoalServiceImp;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class GoalController {

    @Autowired
    private final GoalServiceImp service;

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

    public void changeGoal(Long id,
                           @Nullable String name,
                           @Nullable List<String> tags,
                           @Nullable LocalDate deadLine,
                           @Nullable Priority priority){
        Goal goal = getGoal(id);
        if (name!=null) goal.setName(name);
        if (tags!=null) goal.setTags(tags);
        if (deadLine!=null) goal.setDeadLine(deadLine);
        if (priority!=null) goal.setPriority(priority);
        service.updateGoal(id, goal);
    }

    public void deleteGoal(Long id){
        service.deleteGoal(id);
    }

}
