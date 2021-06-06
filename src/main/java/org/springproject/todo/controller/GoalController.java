package org.springproject.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springproject.todo.model.Goal;
import org.springproject.todo.model.Priority;
import org.springproject.todo.service.GoalServiceImp;


import java.util.Date;
import java.util.List;

@Controller
public class GoalController {

    @Autowired
    private final GoalServiceImp service;

    public GoalController(GoalServiceImp service){
        this.service = service;
    }


    @RequestMapping("/goals")
    public @ResponseBody List<Goal> getGoals(){
        return service.getGoals();
    }


    public Goal getGoal(Long id){
        return service.getGoal(id);
    }


    public Goal createGoal(){
        Goal goal = new Goal();
        service.createGoal(goal);
        return goal;
    }

    public void changeGoal(Long id,
                           @Nullable String name,
                           @Nullable List<String> tags,
                           @Nullable Date deadLine,
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
