package org.springproject.todo.service;

import org.springproject.todo.model.Goal;

import java.util.Collection;

public interface GoalService {
    void createGoal(Goal goal);
    void updateGoal(Long id, Goal goal);
    void deleteGoal(Long id);
    Collection<Goal> getGoals();
    Goal getGoal(Long id);
}
