package edu.bab.libr.service.record.interfaces;

import edu.bab.libr.model.Reader;
import edu.bab.libr.model.Record;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:59
 * @class IRecordService
 */
public interface IRecordService {
    Record create(Record record);
    Record get (String id);
    Record update(Record record);
    void delete(String id);
    List<Record> getAll();
}
