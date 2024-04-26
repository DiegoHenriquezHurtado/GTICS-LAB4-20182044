package com.example.lab420182044.repository;

import com.example.lab420182044.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados,Integer> {
}
