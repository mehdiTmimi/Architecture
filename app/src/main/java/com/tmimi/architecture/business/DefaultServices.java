package com.tmimi.architecture.business;

import com.tmimi.architecture.dao.MemoryToDoDao;
import com.tmimi.architecture.dao.SgbdToDoDao;
import com.tmimi.architecture.dao.ToDoDao;
import com.tmimi.architecture.models.ToDo;

import java.util.List;

public class DefaultServices implements Services{

    private ToDoDao toDoDao;

    public DefaultServices(ToDoDao toDoDao)
    {
        toDoDao=new SgbdToDoDao();
    }
    @Override
    public ToDo addToDo(ToDo toDo) {

        return toDoDao.addToDo(toDo);
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        return toDoDao.updateToDo(toDo);
    }

    @Override
    public boolean deleteToDo(int id) {
        return false;
    }

    @Override
    public ToDo getToDo(int id) {
        return null;
    }

    @Override
    public List<ToDo> getToDos() {
        return null;
    }

    @Override
    public List<ToDo> getSortedToDos() {
        List<ToDo> tds=toDoDao.getToDos();
        // la logique
        return tds;
    }
}
