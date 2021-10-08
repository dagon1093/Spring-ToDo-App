package org.springproject.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springproject.todo.model.Goal;
import org.springproject.todo.repository.GoalRepository;

import java.util.*;

@Service
public class GoalServiceImp implements GoalService{

    @Autowired
    private GoalRepository repository;

    @Override
    public void createGoal(Goal goal){
        repository.save(goal);
    }

    @Override
    public ArrayList<Goal> getGoals() {
        ArrayList<Goal> goals = new ArrayList<>();
        repository.findAll().forEach(goals::add);
        return goals;
    }

    @Override
    public void updateGoal(Long id, Goal goal) {
        repository.save(goal);
    }

    @Override
    public Goal getGoal(Long id) {
        Optional<Goal> goal = repository.findById(id);
        return goal.get();
    }

    @Override
    public void deleteGoal(Long id) {
        repository.deleteById(id);
    }


}
