package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    /*
    Este método declara un método llamado findAll() que devuelve una lista de objetos
    de tipo Employee. Este método se utiliza para recuperar todos los empleados
    de la base de datos.
    */
    List<Employee> findAll();

    /*
    Este método declara un método llamado findById(int theId) que toma un parámetro theId
    de tipo int y devuelve un objeto Employee. Este método se utiliza para buscar un empleado
    por su identificador único en la base de datos.
    */
    Employee findById(int theId);

    /*
    Este método declara un método llamado save(Employee theEmployee) que toma un
    parámetro theEmployee de tipo Employee y devuelve un objeto Employee.
    Este método se utiliza para guardar o actualizar un empleado en la base de datos.
    */
    Employee save(Employee theEmployee);

    /*
    Este método declara un método llamado deleteById(int theId) que toma un
    parámetro theId de tipo int y no devuelve ningún valor (void).
    Este método se utiliza para eliminar un empleado de la base de datos basado en su
    identificador único.
    */
    void deleteById(int theId);

}










