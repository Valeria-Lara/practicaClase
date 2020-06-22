package com.PracticaClase.Services;

import com.PracticaClase.Models.Sucursal;
import com.PracticaClase.Repository.CRUD;
import com.PracticaClase.Repository.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServices extends CRUD<Sucursal, SucursalRepository> {
    public SucursalServices(SucursalRepository Repository) {
        super(Repository);
    }

    @Override
    public List<Sucursal> list() {
        return Repository.findAll();
    }

    @Override
    public Sucursal get(int id) {
        return null;
    }

    @Override
    public void add(Sucursal o) {
        Repository.save(o);
    }

    @Override
    public void update(Sucursal o, int id) {

    }

    @Override
    public void delete(int id) {

    }



}
