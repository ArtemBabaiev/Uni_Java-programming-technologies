package edu.bab.libr.repository.reader;

import edu.bab.libr.model.Publication;
import edu.bab.libr.model.Reader;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:45
 * @class ReaderFakeRepository
 */
@Repository
public class ReaderFakeRepository {
    private List<Reader> list = new ArrayList<>(Arrays.asList(
            new Reader(),
            new Reader()
    ));
    public List<Reader> findAll(){
        return this.list;
    }
}
