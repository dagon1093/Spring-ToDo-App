package org.springproject.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springproject.todo.model.Goal;


@Repository
public interface GoalRepository extends CrudRepository<Goal, Long> {

//    List<Goal> findByTags(List<String> tags);

}
