package com.app.toDoApp.controller;


import com.app.toDoApp.dto.ToDoDto;
import com.app.toDoApp.model.ToDo;
import com.app.toDoApp.service.ToDoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService){
        this.toDoService=toDoService;
    }

    @GetMapping("/toDoItems")
    public ResponseEntity<List<ToDo>> getAllToDoItems(){
        List<ToDo> toDoList=toDoService.getAllToDoItems();
        return ResponseEntity.ok(toDoList);
    }
    
    @PostMapping("/addItem")
    public void addItem(@RequestBody ToDo toDo){
        toDoService.addItem(toDo);
    }
    @PutMapping("/updateItem")
    public void updateItem(@RequestBody ToDo toDo){
        toDoService.updateItem(toDo.getId(),toDo);
    }
    @DeleteMapping("/deleteItem")
    public void deleteItem(@RequestBody ToDo toDo){
        toDoService.deleteItem(toDo.getId());
    }








}
