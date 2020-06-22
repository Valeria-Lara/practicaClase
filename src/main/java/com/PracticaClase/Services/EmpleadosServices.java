package com.PracticaClase.Services;

import com.PracticaClase.Models.Empleados;
import com.PracticaClase.Repository.CRUD;
import com.PracticaClase.Repository.EmpleadosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadosServices extends CRUD<Empleados, EmpleadosRepository> {


    public EmpleadosServices(EmpleadosRepository Repository) {
        super(Repository);
    }

    @Override
    public List<Empleados> list() {
        return Repository.findAll();
    }

    @Override
    public Empleados get(int id) {
        return Repository.findById(id).get();
    }

    @Override
    public void add(Empleados o) {
        Repository.save(o);
    }

    @Override
    public void update(Empleados o, int id) {
        o.setId(id);
        Repository.save(o);
    }

    @Override
    public void delete(int id) {
        Repository.deleteById(id);
    }
}
