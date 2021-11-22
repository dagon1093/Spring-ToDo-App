package org.springproject.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springproject.todo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
