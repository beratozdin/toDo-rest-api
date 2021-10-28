package com.app.toDoApp.repository;

import com.app.toDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo,Integer> {

}
