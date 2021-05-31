package org.springproject.todo.dto;

import lombok.*;
import org.springproject.todo.model.Priority;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoalDTO {

    private Long id;
    private String name;
    private List<String> tags;
    private Date deadLine;
    private Priority priority;

}
