package org.springproject.todo.mapping;

import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.model.Goal;

public class Mapper {

    public Goal toEntity(GoalDTO dto){
        Goal entity = new Goal();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setTags(dto.getTags());
        entity.setDeadLine(dto.getDeadLine());
        entity.setPriority(dto.getPriority());
        return entity;
    }

    public GoalDTO toDto(Goal entity){
        GoalDTO dto = new GoalDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setTags(entity.getTags());
        dto.setDeadLine(entity.getDeadLine());
        dto.setPriority(entity.getPriority());
        return dto;
    }
}
