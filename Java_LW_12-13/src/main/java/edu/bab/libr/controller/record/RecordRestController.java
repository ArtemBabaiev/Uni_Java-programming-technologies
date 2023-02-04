package edu.bab.libr.controller.record;

import edu.bab.libr.model.Reader;
import edu.bab.libr.model.Record;
import edu.bab.libr.service.reader.impls.ReaderServiceImpl;
import edu.bab.libr.service.record.impls.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:26
 * @class RecordRestController
 */
@RestController
@RequestMapping("/api/v1/records")
public class RecordRestController {
    @Autowired
    RecordServiceImpl service;

    @RequestMapping("/")
    List<Record> showAll(){
        return  service.getAll();
    }
}
