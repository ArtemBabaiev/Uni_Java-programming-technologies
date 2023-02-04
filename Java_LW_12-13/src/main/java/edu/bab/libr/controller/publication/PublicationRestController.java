package edu.bab.libr.controller.publication;

import edu.bab.libr.model.Fine;
import edu.bab.libr.model.Publication;
import edu.bab.libr.service.fine.impls.FineServiceImpl;
import edu.bab.libr.service.publication.impls.PublicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 20:23
 * @class PublicationRestController
 */
@RestController
@RequestMapping("/api/v1/publications")
public class PublicationRestController {
    @Autowired
    PublicationServiceImpl service;

    @RequestMapping("/")
    List<Publication> showAll(){
        return  service.getAll();
    }
}
