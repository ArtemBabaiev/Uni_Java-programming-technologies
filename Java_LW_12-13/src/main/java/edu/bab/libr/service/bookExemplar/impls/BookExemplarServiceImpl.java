package edu.bab.libr.service.bookExemplar.impls;



import edu.bab.libr.model.BookExemplar;
import edu.bab.libr.repository.bookExemplar.BookExemplarFakeRepository;
import edu.bab.libr.service.bookExemplar.interfaces.IBookExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 18:36
 * @class BookExemplarServiceImpl
 */

@Service
public class BookExemplarServiceImpl implements IBookExemplarService {

    @Autowired
    BookExemplarFakeRepository repository;


    @Override
    public BookExemplar create(BookExemplar bookExemplar) {
        return null;
    }

    @Override
    public BookExemplar get(String id) {
        return null;
    }

    @Override
    public BookExemplar update(BookExemplar bookExemplar) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<BookExemplar> getAll() {
        return repository.findAll();
    }
}
