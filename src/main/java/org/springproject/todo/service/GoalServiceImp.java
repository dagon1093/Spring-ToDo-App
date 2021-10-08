package org.springproject.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.mapping.GoalMapper;
import org.springproject.todo.model.Goal;
import org.springproject.todo.repository.GoalRepository;

import java.util.*;

@Service
public class GoalServiceImp implements GoalService{

    @Autowired
    private GoalRepository repository;
    private GoalMapper goalMapper;

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
    public void updateGoal(Long id, GoalDTO goal) {
        Goal entityGoal = goalMapper.goalToEntity(goal);
        repository.save(entityGoal);
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
