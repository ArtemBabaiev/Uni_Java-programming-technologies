package edu.bab.libr.service.publication.interfaces;

import edu.bab.libr.model.Condition;
import edu.bab.libr.model.Fine;
import edu.bab.libr.model.Publication;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:55
 * @class IPublicationService
 */
public interface IPublicationService {
    Publication create(Publication publication);
    Publication get (String id);
    Publication update(Publication publication);
    void delete(String id);
    List<Publication> getAll();
}
