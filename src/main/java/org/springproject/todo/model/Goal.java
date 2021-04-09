package org.springproject.todo.model;

import java.util.Date;
import java.util.List;


public class Goal {
//   остановился на long для поля id
    private long id;
    private String name;
    private boolean isDone;
    private Date creationDate;
    private Date modificationDate;
    private List<String> tags;
    private Date deadLine;
    private byte priority;

}
