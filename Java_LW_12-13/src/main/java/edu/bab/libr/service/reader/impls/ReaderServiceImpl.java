package edu.bab.libr.service.reader.impls;

import edu.bab.libr.model.Reader;
import edu.bab.libr.repository.reader.ReaderFakeRepository;
import edu.bab.libr.service.reader.interfaces.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:10
 * @class IReaderServiceImpl
 */
@Service
public class ReaderServiceImpl implements IReaderService {
    @Autowired
    ReaderFakeRepository repository;

    @Override
    public Reader create(Reader reader) {
        return null;
    }

    @Override
    public Reader get(String id) {
        return null;
    }

    @Override
    public Reader update(Reader reader) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Reader> getAll() {
        return repository.findAll();
    }
}
