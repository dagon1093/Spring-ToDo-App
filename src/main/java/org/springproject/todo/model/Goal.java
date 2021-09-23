package org.springproject.todo.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "Goal")
@ToString
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isDone;
    private LocalDate creationDate;
    private LocalDate modificationDate;
    @ElementCollection
    private List<String> tags;
    private LocalDate deadLine;
    private Priority priority;


}
