package edu.bab.libr.service.reader.interfaces;

import edu.bab.libr.model.Employee;
import edu.bab.libr.model.Reader;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:57
 * @class IReaderService
 */
public interface IReaderService {
    Reader create(Reader reader);
    Reader get (String id);
    Reader update(Reader reader);
    void delete(String id);
    List<Reader> getAll();
}
