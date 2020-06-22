package com.PracticaClase.Restcontrollers;

import com.PracticaClase.Models.Sucursal;
import com.PracticaClase.Services.SucursalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sucursal")
public class SucursalRestControllers {
    @Autowired
    SucursalServices servicio;


    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/list")
    public List<Sucursal> list(){
        return servicio.list();
    }


    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/add")
    public void add(@RequestBody Sucursal sucursal){
        servicio.add(sucursal);
    }


}
