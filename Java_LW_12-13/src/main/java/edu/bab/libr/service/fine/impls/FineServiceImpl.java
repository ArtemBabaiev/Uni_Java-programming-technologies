package edu.bab.libr.service.fine.impls;

import edu.bab.libr.model.Fine;
import edu.bab.libr.repository.fine.FineFakeRepository;
import edu.bab.libr.service.fine.interfaces.IFineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:02
 * @class IFineServiceImpl
 */
@Service
public class FineServiceImpl implements IFineService {
    @Autowired
    FineFakeRepository repository;

    @Override
    public Fine create(Fine fine) {
        return null;
    }

    @Override
    public Fine get(String id) {
        return null;
    }

    @Override
    public Fine update(Fine fine) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Fine> getAll() {
        return repository.findAll();
    }
}
