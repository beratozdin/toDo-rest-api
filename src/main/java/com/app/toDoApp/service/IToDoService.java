package com.app.toDoApp.service;

import com.app.toDoApp.dto.ToDoDto;
import com.app.toDoApp.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface IToDoService {

    public List<ToDo> getAllToDoItems();
    public Optional<ToDo> findToDoItemById(Integer itemId);
    public void addItem(ToDo item);
    public void deleteItem(Integer itemId);
    public void updateItem(Integer itemId, ToDo toDo);

}
