package edu.bab.libr.repository.bookExemplar;

import edu.bab.libr.model.BookExemplar;
import edu.bab.libr.model.Condition;
import edu.bab.libr.model.Publication;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 18:39
 * @class BookExemplarFakeRepository
 */
@Repository
public class BookExemplarFakeRepository {
    private List<BookExemplar> list = new ArrayList<>(Arrays.asList(
            new BookExemplar("name1", "description1", new Publication(), "00000000", "1 month", 10, 15, new Condition()),
            new BookExemplar("name2", "description2", new Publication(), "00000000", "1 month", 10, 15, new Condition())
    ));
    public List<BookExemplar> findAll(){
        return this.list;
    }
}
