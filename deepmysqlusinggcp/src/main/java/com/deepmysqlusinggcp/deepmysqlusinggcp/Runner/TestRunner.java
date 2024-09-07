package com.deepmysqlusinggcp.deepmysqlusinggcp.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deepmysqlusinggcp.deepmysqlusinggcp.Model.Employee;
import com.deepmysqlusinggcp.deepmysqlusinggcp.Repository.EmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void run(String... args) throws Exception {
       
        Employee employee= new Employee(1, "Deepak");
        
        employeeRepo.save(employee);

        System.out.println("Saved in DB");

        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
