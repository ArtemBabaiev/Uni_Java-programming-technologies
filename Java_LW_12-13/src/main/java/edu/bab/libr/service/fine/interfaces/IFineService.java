package edu.bab.libr.service.fine.interfaces;

import edu.bab.libr.model.Condition;
import edu.bab.libr.model.Employee;
import edu.bab.libr.model.Fine;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:54
 * @class IFineService
 */
public interface IFineService {
    Fine create(Fine fine);
    Fine get (String id);
    Fine update(Fine fine);
    void delete(String id);
    List<Fine> getAll();
}
