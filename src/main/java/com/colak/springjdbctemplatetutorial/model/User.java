package com.colak.springjdbctemplatetutorial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("USERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column("USER_ID")
    private Long userId;

    @Column("FIRST_NAME")
    private String firstName;

    @Column("LAST_NAME")
    private String lastName;

    @Column("EMAIL")
    private String email;

    @MappedCollection(idColumn = "USER_ID", keyColumn = "TASK_ID")
    private List<Task> tasks;
}
