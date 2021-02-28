package com.tmimi.architecture.dao;

import com.tmimi.architecture.models.ToDo;

import java.util.ArrayList;
import java.util.List;

public class MemoryToDoDao implements ToDoDao{
    private List<ToDo> toDos;
    private int max;

    public MemoryToDoDao(){
        toDos=new ArrayList<>();
        toDos.add(new ToDo(1,"dentiste",
                "rendez-vous : jeudi 2 fevrier 2021","01-02-2021"));
        toDos.add(new ToDo(2,"cours",
                "rattrapage android : mercredi 27 fevrier 2021","20-01-2021"));
    max=2;
    }
    @Override
    public ToDo addToDo(ToDo toDo) {
        toDo.setId(++max);
        toDos.add(toDo);
        return toDo;
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        for (ToDo t:toDos)
            if(t.getId()==toDo.getId())
            {
                t.setContent(toDo.getContent());
                t.setCreationDate(toDo.getCreationDate());
                t.setTitle(toDo.getTitle());
                return t;
            }
        return null;
    }

    @Override
    public boolean deleteToDo(int id) {
        for (ToDo t:toDos)
            if(t.getId()==id)
               {
                   toDos.remove(t);
                   return true;
               }
        return false;
    }

    @Override
    public ToDo getToDo(int id) {
        for (ToDo t:toDos)
                if(t.getId()==id)
                    return t;
        return null;
    }

    @Override
    public List<ToDo> getToDos() {
        return toDos;
    }
}
