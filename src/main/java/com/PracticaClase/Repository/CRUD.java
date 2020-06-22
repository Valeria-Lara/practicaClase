package com.PracticaClase.Repository;

import java.util.List;

public abstract class CRUD <T, E> {


    protected E Repository;


    public CRUD(E Repository){
        this.Repository = Repository;
    }

    public abstract List<T> list();

    public abstract T get(int id);

    public abstract void add(T o);

    public abstract void update(T o, int id);

    public abstract void delete(int id);

}

