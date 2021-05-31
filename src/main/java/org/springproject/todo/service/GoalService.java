package org.springproject.todo.service;

import org.springproject.todo.model.Goal;

import java.util.Collection;

public interface GoalService {
    public abstract void createGoal(Goal goal);
    public abstract void updateGoal(Long id, Goal goal);
    public abstract void deleteGoal(Long id);
    public abstract Collection<Goal> getGoals();
    public abstract Goal getGoal(Long id);
}
