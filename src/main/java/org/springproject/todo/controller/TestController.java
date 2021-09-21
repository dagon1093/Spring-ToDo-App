package org.springproject.todo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springproject.todo.model.Goal;
import org.springproject.todo.service.GoalServiceImp;

//Контроллер для экспериментов
@RequestMapping("/test")
@Controller
public class TestController {


    @Autowired
    private final GoalServiceImp service;

    public TestController(GoalServiceImp service){
        this.service = service;
    }

// Сопоставление тестовых запросов
    @RequestMapping({"/",""})
    public @ResponseBody String homePage(){
        return service.getHome();
    }

    @RequestMapping("/creategoal")
    public @ResponseBody String createGoal(){
        Goal goal = new Goal();
        goal.setName("Cover the code with tests");
        service.createGoal(goal);
        return goal.toString();
    }

}
