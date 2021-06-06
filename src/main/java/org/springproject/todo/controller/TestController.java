package org.springproject.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springproject.todo.model.Goal;
import org.springproject.todo.service.GoalServiceImp;

//Контроллер для экспериментов
@Controller
public class TestController {


    private final GoalServiceImp service;

    public TestController(GoalServiceImp service){
        this.service = service;
    }

// Сопоставление тестовых запросов
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String homePage(){
        return service.getHome();
    }

    @RequestMapping("/test/creategoal")
    public String createGoal(){
        Goal goal = new Goal();
        goal.setName("Cover the code with tests");
        service.createGoal(goal);
        return goal.toString();
    }

}
