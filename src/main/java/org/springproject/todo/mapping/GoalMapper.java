package org.springproject.todo.mapping;

import org.mapstruct.Mapper;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;

@Mapper(componentModel = "spring")
public interface GoalMapper {
    Goal entityToDto(GoalDTO dto);
    GoalDTO dtoToEntity(Goal entity);
}
