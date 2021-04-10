package org.springproject.todo.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoalDTO {

    private long id;
    private String name;
    private List<String> tags;
    private Date deadLine;
    private byte priority;

}
