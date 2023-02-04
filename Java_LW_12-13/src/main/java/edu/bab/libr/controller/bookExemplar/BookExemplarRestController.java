package edu.bab.libr.controller.bookExemplar;

import edu.bab.libr.model.BookExemplar;
import edu.bab.libr.service.bookExemplar.impls.BookExemplarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 08.05.2022 18:14
 * @class BookExemplarRestController
 */

@RestController
@RequestMapping("/api/v1/bookExemplars")
public class BookExemplarRestController {

    @Autowired
    BookExemplarServiceImpl service;

    @RequestMapping("/")
    List<BookExemplar> showAll(){
        return  service.getAll();
    }
}
