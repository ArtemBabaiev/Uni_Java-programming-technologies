package edu.bab.libr.controller.reader;

import edu.bab.libr.model.Publication;
import edu.bab.libr.model.Reader;
import edu.bab.libr.service.publication.impls.PublicationServiceImpl;
import edu.bab.libr.service.reader.impls.ReaderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:26
 * @class ReaderRestController
 */
@RestController
@RequestMapping("/api/v1/readers")
public class ReaderRestController {
    @Autowired
    ReaderServiceImpl service;

    @RequestMapping("/")
    List<Reader> showAll(){
        return  service.getAll();
    }
}
