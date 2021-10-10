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

    @Override
    public GoalDTO createGoal(GoalDTO goalDto){
        Goal goalEntity = repository.save(GoalMapper.INSTANCE.goalToEntity(goalDto));
        return GoalMapper.INSTANCE.goalToDto(goalEntity);

    }

    @Override
    public ArrayList<GoalDTO> getGoals() {
        ArrayList<GoalDTO> goals = new ArrayList<>();
        for( Goal goal : repository.findAll()){goals.add(GoalMapper.INSTANCE.goalToDto(goal));}
        return goals;
    }

    @Override
    public GoalDTO updateGoal(GoalDTO goal) {
        Goal entityGoal = repository.save(GoalMapper.INSTANCE.goalToEntity(goal));
        return GoalMapper.INSTANCE.goalToDto(entityGoal);
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
