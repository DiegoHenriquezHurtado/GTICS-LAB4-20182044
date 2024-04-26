package com.example.lab420182044.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id",nullable = false)
    private Integer idEmpleado;

    @Column(name = "first_name",length = 20)
    private String nombre;

    @Column(name="last_name",nullable = false,length = 25)
    private String apellido;

    @Column(name = "email",nullable = false,length = 25)
    private String email;

    @Column(name = "password",length = 65)
    private String contrasena;

    @Column(name = "phone_number",length = 20)
    private String telefono;

    @Column(name = "hire_date",nullable = false)
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "job_id",nullable = false)
    private Jobs jobs;

    @Column(name = "salary")
    private Float salario;

    @Column(name = "commission_pct")
    private Float comision;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Empleados empleados;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "enabled")
    private Integer enabled;
}
