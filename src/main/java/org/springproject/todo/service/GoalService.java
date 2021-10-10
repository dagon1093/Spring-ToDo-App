package org.springproject.todo.service;

import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;


import java.util.List;

public interface GoalService {
    GoalDTO createGoal(GoalDTO goal);
    GoalDTO updateGoal(GoalDTO goal);
    void deleteGoal(Long id);
    List<GoalDTO> getGoals();
    Goal getGoal(Long id);

}
