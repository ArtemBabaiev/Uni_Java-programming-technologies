package edu.bab.libr.repository.record;

import edu.bab.libr.model.Employee;
import edu.bab.libr.model.Record;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:46
 * @class RecordFakeRepository
 */
@Repository
public class RecordFakeRepository {
    private List<Record> list = new ArrayList<>(Arrays.asList(
            new Record(),
            new Record()
    ));
    public List<Record> findAll(){
        return this.list;
    }
}
