package org.springproject.todo.controller;


import org.springframework.web.bind.annotation.*;
import org.springproject.todo.model.Goal;
import org.springproject.todo.service.GoalService;
import org.springproject.todo.service.GoalServiceImp;

//Контроллер для экспериментов
@RequestMapping("/test")
@RestController
public class TestController {


    private final GoalService service;

    public TestController(GoalServiceImp service){
        this.service = service;
    }

// Сопоставление тестовых запросов


}
