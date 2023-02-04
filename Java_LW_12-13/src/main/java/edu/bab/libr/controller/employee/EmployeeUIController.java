package edu.bab.libr.controller.employee;

import edu.bab.libr.form.EmployeeFrom;
import edu.bab.libr.model.Employee;
import edu.bab.libr.service.employee.impls.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:38
 * @class EmployeeUIController
 */

@Controller
@RequestMapping("/ui/v1/employees")
public class EmployeeUIController {
    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/")
    String showAll(Model model){
        List<Employee> employees = service.getAll();
        model.addAttribute("employees", employees);
        return "employees-all";
    }

    @GetMapping("/delete/{id}")
    String delete(@PathVariable String id){
        service.delete(id);
        return "redirect:/ui/v1/employees/";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String addEmployee(Model model){
        EmployeeFrom employeeFrom = new EmployeeFrom();

        model.addAttribute("form", employeeFrom);
        return "add-employee";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addEmployee( @ModelAttribute("form") EmployeeFrom form ){
        Employee employee = new Employee();
        employee.setName(form.getName());
        employee.setDescription(form.getDescription());
        LocalDateTime ldt = LocalDateTime.now();
        employee.setCreatedAt(ldt);
        employee.setUpdatedAt(ldt);
        service.create(employee);

        return "redirect:/ui/v1/employees/";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editItem(Model model, @PathVariable("id") String id){
        Employee employee = service.getOneById(id);
        EmployeeFrom employeeFrom = new EmployeeFrom();
        employeeFrom.setId(employee.getId());
        employeeFrom.setName(employee.getName());
        employeeFrom.setDescription(employee.getDescription());
        employeeFrom.setCreatedAt(employee.getCreatedAt().toString());

        model.addAttribute("form",employeeFrom);

        return "edit-employee";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editItem(@PathVariable("id") String id,
                           @ModelAttribute("form") EmployeeFrom form ){
        Employee employee = service.getOneById(form.getId());
        employee.setName(form.getName());
        employee.setDescription(form.getDescription());

        service.update(employee);

        return "redirect:/ui/v1/employees/";
    }
}
