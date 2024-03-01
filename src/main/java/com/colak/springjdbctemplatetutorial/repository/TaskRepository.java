package com.colak.springjdbctemplatetutorial.repository;

import com.colak.springjdbctemplatetutorial.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    Task findByTaskId(int taskId);

    void deleteByTaskId(int taskId);
}
