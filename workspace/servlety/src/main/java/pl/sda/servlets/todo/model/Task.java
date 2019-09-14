package pl.sda.servlets.todo.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Task {
    private Integer id;
    private String description;
    private LocalDate date;
    private boolean done;

}
