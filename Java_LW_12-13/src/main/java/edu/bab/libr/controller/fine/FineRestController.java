package edu.bab.libr.controller.fine;

import edu.bab.libr.model.Employee;
import edu.bab.libr.model.Fine;
import edu.bab.libr.service.fine.impls.FineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:23
 * @class FineRestController
 */
@RestController
@RequestMapping("/api/v1/fines")

public class FineRestController {
    @Autowired
    FineServiceImpl service;

    @RequestMapping("/")
    List<Fine> showAll(){
        return  service.getAll();
    }
}
