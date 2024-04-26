package com.example.lab420182044.Controller;

import com.example.lab420182044.entity.Empleados;
import com.example.lab420182044.repository.DepartmentRepository;
import com.example.lab420182044.repository.EmpleadosRepository;
import com.example.lab420182044.repository.JobsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    final DepartmentRepository departmentRepository;
    final EmpleadosRepository empleadosRepository;
    final JobsRepository jobsRepository;

    public HomeController(DepartmentRepository departmentRepository,EmpleadosRepository empleadosRepository,JobsRepository jobsRepository){
        this.departmentRepository = departmentRepository;
        this.empleadosRepository = empleadosRepository;
        this.jobsRepository = jobsRepository;
    }
    @GetMapping(value ={"/paginaPrincipal"})
    public String paginaPrincipal(){
        return "index";
    }

    @GetMapping(value ={"/empleados"})
    public String paginaEmpleados(Model model){
        List<Empleados> listEmpleados= empleadosRepository.findAll();
        model.addAttribute("listEmpleados",listEmpleados);

        return "Employees/empleados";
    }
}
