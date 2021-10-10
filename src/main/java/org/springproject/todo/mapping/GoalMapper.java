package org.springproject.todo.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;

@Mapper(componentModel = "spring")
public interface GoalMapper {

    GoalMapper INSTANCE = Mappers.getMapper(GoalMapper.class);

    GoalDTO goalToDto(Goal dto);
    Goal goalToEntity(GoalDTO entity);
}
