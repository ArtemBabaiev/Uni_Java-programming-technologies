package edu.bab.libr.repository.employee;

import edu.bab.libr.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 12.05.2022 13:28
 * @class EmployeeMongoRepository
 */
@Repository
public interface EmployeeMongoRepository extends MongoRepository <Employee, String>{


}
