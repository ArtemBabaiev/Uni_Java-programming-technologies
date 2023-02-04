package edu.bab.libr.repository.fine;

import edu.bab.libr.model.Employee;
import edu.bab.libr.model.Fine;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:40
 * @class FineFakeRepository
 */
@Repository
public class FineFakeRepository {
    private List<Fine> list = new ArrayList<>(Arrays.asList(
            new Fine("String name", "String description", "String fineType", 15),
            new Fine("String name1", "String description1", "String fineType2", 16)
    ));
    public List<Fine> findAll(){
        return this.list;
    }
}
