package edu.bab.libr.controller.condition;

import edu.bab.libr.model.Condition;
import edu.bab.libr.service.condition.impls.CondtionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 19:15
 * @class ConditionRestController
 */
@RestController
@RequestMapping("/api/v1/condtions")
public class ConditionRestController {
    @Autowired
    CondtionServiceImpl service;

    @RequestMapping("/")
    List<Condition> showAll(){
        return  service.getAll();
    }
}
