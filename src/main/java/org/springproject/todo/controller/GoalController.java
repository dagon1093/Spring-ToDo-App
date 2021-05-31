package org.springproject.todo.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springproject.todo.model.Goal;
import org.springproject.todo.model.Priority;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class GoalController {

    public GoalController(){}

//  Заглуша
    @RequestMapping("/goals")
    public List<Goal> getGoals(){
        return new ArrayList<>();
    }

//  Заглушка
    public Goal getGoal(Long id){
        return new Goal();
    }

//  Заглушка
    public Goal createGoal(String name, ArrayList<String> tags , Date deadLine, Priority priority){
        Goal goal = new Goal();
        goal.setName(name);
        goal.setTags(tags);
        goal.setDeadLine(deadLine);
        goal.setPriority(priority);
        return goal;
    }

//    Заглушка
    public void changeGoal(Long id,
                           @Nullable String name,
                           @Nullable List<String> tags,
                           @Nullable Date deadLine,
                           @Nullable Priority priority){
        if (name!=null) getGoal(id).setName(name);
        if (tags!=null) getGoal(id).setTags(tags);
        if (deadLine!=null) getGoal(id).setDeadLine(deadLine);
        if (priority!=null) getGoal(id).setPriority(priority);
    }

    public void deleteGoal(Long id){

    }

}
