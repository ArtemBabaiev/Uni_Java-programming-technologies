package edu.bab.libr.service.employee.interfaces;

import edu.bab.libr.model.Condition;
import edu.bab.libr.model.Employee;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:34
 * @class IEmployeeService
 */
public interface IEmployeeService {
    Employee create(Employee employee);
    Employee get (String id);
    Employee update(Employee employee);
    void delete(String id);
    List<Employee> getAll();
    Employee getOneById(String id);
}
