package edu.bab.libr.service.condition.interfaces;

import edu.bab.libr.model.BookExemplar;
import edu.bab.libr.model.Condition;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:18
 * @class ICondtionService
 */
public interface ICondtionService {
    Condition create(Condition condition);
    Condition get (String id);
    Condition update(Condition condition);
    void delete(String id);
    List<Condition> getAll();
}
