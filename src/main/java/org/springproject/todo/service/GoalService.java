package org.springproject.todo.service;

import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;


import java.util.List;

public interface GoalService {
    void createGoal(Goal goal);
    void updateGoal(Long id, GoalDTO goal);
    void deleteGoal(Long id);
    List<Goal> getGoals();
    Goal getGoal(Long id);

}
