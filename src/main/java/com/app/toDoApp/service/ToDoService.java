package com.app.toDoApp.service;

import com.app.toDoApp.dto.ToDoDto;
import com.app.toDoApp.model.ToDo;
import com.app.toDoApp.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService implements IToDoService{

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository){
        this.toDoRepository=toDoRepository;
    }

    public List<ToDo> getAllToDoItems(){
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findToDoItemById(Integer itemId){
        return toDoRepository.findById(itemId);
    }

    public void addItem(ToDo item){

        toDoRepository.save(item);
    }
    public void updateItem(Integer itemId, ToDo toDo){

        ToDo updatingItem=toDoRepository.findById(itemId).get();
        updatingItem.setName(toDo.getName());
        updatingItem.setDescription(toDo.getDescription());
        updatingItem.setStatus(toDo.getStatus());
        toDoRepository.save(updatingItem);
    }

    public void deleteItem(Integer itemId){
        toDoRepository.deleteById(itemId);
    }
}
