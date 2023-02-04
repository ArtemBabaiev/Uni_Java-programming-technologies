package edu.bab.libr.service.condition.impls;

import edu.bab.libr.model.Condition;
import edu.bab.libr.repository.condition.CondtioionFakeRepository;
import edu.bab.libr.service.condition.interfaces.ICondtionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:19
 * @class CondtionServiceImpl
 */
@Service
public class CondtionServiceImpl implements ICondtionService {
    @Autowired
    CondtioionFakeRepository repository;

    @Override
    public Condition create(Condition condition) {
        return null;
    }

    @Override
    public Condition get(String id) {
        return null;
    }

    @Override
    public Condition update(Condition condition) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Condition> getAll() {
        return repository.findAll();
    }
}
