package com.colak.springjdbctemplatetutorial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "TASKS")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @Column("TASK_ID")
    private int taskId;

    @Column("TASK_NAME")
    private String taskName;

    @Column("USER_ID")
    private int userId;
}
