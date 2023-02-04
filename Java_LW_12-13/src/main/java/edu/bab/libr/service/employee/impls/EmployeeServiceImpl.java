package edu.bab.libr.service.employee.impls;

import edu.bab.libr.model.Employee;
import edu.bab.libr.repository.employee.EmployeeFakeRepository;
import edu.bab.libr.repository.employee.EmployeeMongoRepository;
import edu.bab.libr.service.employee.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:35
 * @class EmployeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private List<Employee> list = new ArrayList<>(Arrays.asList(
            new Employee("1", "nam1", "description1", LocalDateTime.now(), LocalDateTime.now()),
            new Employee("2","name2", "description2", LocalDateTime.now(), LocalDateTime.now()),
            new Employee("3","name3", "description3", LocalDateTime.now(), LocalDateTime.now()),
            new Employee("4","name4", "description4", LocalDateTime.now(), LocalDateTime.now())
    ));

    @Autowired
    EmployeeMongoRepository repository;

    //@PostConstruct
    void init(){
        repository.saveAll(list);
    }


    @Override
    public Employee create(Employee employee) {
        employee.setCreatedAt(LocalDateTime.now());
        return repository.save(employee);
    }

    @Override
    public Employee get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        employee.setUpdatedAt(LocalDateTime.now());

        return repository.save(employee);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
    @Override
    public Employee getOneById(String id){
        return repository.findById(id).orElse(null);
    }
}
