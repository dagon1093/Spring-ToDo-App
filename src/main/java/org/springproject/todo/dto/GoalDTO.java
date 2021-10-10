package org.springproject.todo.dto;

import lombok.*;
import org.springproject.todo.model.Priority;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoalDTO {

    private Long id;
    private String name;
    private List<String> tags;
    private LocalDate deadLine;
    private Priority priority;

}
