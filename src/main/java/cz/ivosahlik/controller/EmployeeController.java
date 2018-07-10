package cz.ivosahlik.controller;

import cz.ivosahlik.models.Employee;
import cz.ivosahlik.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/07/2018
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/listPageable", method = RequestMethod.GET)
    Page<Employee> employeesPage(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

}
