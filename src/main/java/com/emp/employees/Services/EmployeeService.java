package com.emp.employees.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employees.Repository.EmployeeRepository;
import com.emp.employees.models.Employee;

import lombok.Data;

@Data
@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Optional <Employee> getEmployees(final Long id){
        return employeeRepository.findById(id);
        
    }

    //Optional est une classe conteneur qui peut contenir ou non une valeur non nulle.
    // Elle est utilisée pour éviter les erreurs de type NullPointerException en Java.

    //Iterable est une interface qui permet de parcourir une collection d'objets.
    // Elle est utilisée pour retourner une liste d'objets.

    public Iterable<Employee> getEmployees()
    {
        return employeeRepository.findAll();

    }

    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
