package com.tmimi.architecture.business;

import com.tmimi.architecture.models.ToDo;

import java.util.List;

public interface Services {
    // todos functions
    public ToDo addToDo(ToDo toDo);
    public ToDo updateToDo(ToDo toDo);
    public boolean deleteToDo(int id);
    public ToDo getToDo(int id);
    public List<ToDo> getToDos();
    public List<ToDo> getSortedToDos();



}
