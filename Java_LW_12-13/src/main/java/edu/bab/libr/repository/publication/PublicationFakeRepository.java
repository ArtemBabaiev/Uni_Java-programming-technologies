package edu.bab.libr.repository.publication;

import edu.bab.libr.model.Fine;
import edu.bab.libr.model.Publication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:41
 * @class PublicationFakeRepository
 */
@Repository
public class PublicationFakeRepository {
    private List<Publication> list = new ArrayList<>(Arrays.asList(
            new Publication(),
            new Publication()
    ));
    public List<Publication> findAll(){
        return this.list;
    }
}
