package edu.bab.libr.service.record.impls;

import edu.bab.libr.model.Record;
import edu.bab.libr.repository.record.RecordFakeRepository;
import edu.bab.libr.service.record.interfaces.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:16
 * @class IRecordServiceImpl
 */
@Service
public class RecordServiceImpl implements IRecordService {
    @Autowired
    RecordFakeRepository repository;
    @Override
    public Record create(Record record) {
        return null;
    }

    @Override
    public Record get(String id) {
        return null;
    }

    @Override
    public Record update(Record record) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Record> getAll() {
        return repository.findAll();
    }
}
