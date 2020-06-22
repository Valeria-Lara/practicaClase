package com.PracticaClase.Repository;


import com.PracticaClase.Models.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {
}
