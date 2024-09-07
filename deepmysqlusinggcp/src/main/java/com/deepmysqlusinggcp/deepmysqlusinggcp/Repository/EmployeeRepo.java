package com.deepmysqlusinggcp.deepmysqlusinggcp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepmysqlusinggcp.deepmysqlusinggcp.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
