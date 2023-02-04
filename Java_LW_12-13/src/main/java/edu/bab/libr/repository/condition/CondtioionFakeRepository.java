package edu.bab.libr.repository.condition;

import edu.bab.libr.model.BookExemplar;
import edu.bab.libr.model.Condition;
import edu.bab.libr.model.Publication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:17
 * @class CondtioionFakeRepository
 */
@Repository
public class CondtioionFakeRepository {
    private List<Condition> list = new ArrayList<>(Arrays.asList(
            new Condition(),
            new Condition()
    ));
    public List<Condition> findAll(){
        return this.list;
    }
}
