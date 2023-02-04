package edu.bab.libr.controller.employee;

import edu.bab.libr.model.Employee;
import edu.bab.libr.service.employee.impls.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:37
 * @class EmployeeRestController
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {
    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/")
    List<Employee> showAll(){
        return  service.getAll();
    }

    @GetMapping("/{id}")
    Employee showOne(@PathVariable String id){
        return  service.get(id);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping("")
    Employee createOne(@RequestBody Employee employee){
        return  service.create(employee);
    }

    @PutMapping("")
    Employee UpdateOne(@RequestBody Employee employee){
        return  service.update(employee);
    }



}
