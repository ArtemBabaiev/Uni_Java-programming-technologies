package edu.bab.libr.service.bookExemplar.interfaces;

import edu.bab.libr.model.BookExemplar;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 18:29
 * @class IBookExemplarCrud
 */
public interface IBookExemplarService {
    BookExemplar create(BookExemplar bookExemplar);
    BookExemplar get (String id);
    BookExemplar update(BookExemplar bookExemplar);
    void delete(String id);
    List<BookExemplar> getAll();

}
