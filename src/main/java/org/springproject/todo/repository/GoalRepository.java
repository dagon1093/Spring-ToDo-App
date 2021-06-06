package org.springproject.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springproject.todo.model.Goal;

import java.util.List;

public interface GoalRepository extends CrudRepository<Goal, Long> {

//    List<Goal> findByTags(List<String> tags);

}