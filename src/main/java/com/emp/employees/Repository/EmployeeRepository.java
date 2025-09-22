package com.emp.employees.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.employees.models.Employee;

@Repository

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

    

    
}


//CrudRepository est une interface fournie par Spring.
// Elle fournit des méthodes CRUD (Create, Read, Update, Delete) pour interagir avec la base de données.