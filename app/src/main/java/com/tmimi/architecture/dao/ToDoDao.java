package com.tmimi.architecture.dao;

import com.tmimi.architecture.models.ToDo;

import java.util.List;

public interface ToDoDao {
    // 5 : CRUD
    public ToDo addToDo(ToDo toDo);
    public ToDo updateToDo(ToDo toDo);
    public boolean deleteToDo(int id);
    public ToDo getToDo(int id);
    public List<ToDo> getToDos();
}
