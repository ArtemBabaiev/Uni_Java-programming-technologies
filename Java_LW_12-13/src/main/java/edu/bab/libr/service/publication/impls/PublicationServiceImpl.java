package edu.bab.libr.service.publication.impls;

import edu.bab.libr.model.Publication;
import edu.bab.libr.repository.publication.PublicationFakeRepository;
import edu.bab.libr.service.publication.interfaces.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:08
 * @class PublicationServiceImpl
 */
@Service
public class PublicationServiceImpl implements IPublicationService {

    @Autowired
    PublicationFakeRepository repository;

    @Override
    public Publication create(Publication publication) {
        return null;
    }

    @Override
    public Publication get(String id) {
        return null;
    }

    @Override
    public Publication update(Publication publication) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Publication> getAll() {
        return repository.findAll();
    }
}
