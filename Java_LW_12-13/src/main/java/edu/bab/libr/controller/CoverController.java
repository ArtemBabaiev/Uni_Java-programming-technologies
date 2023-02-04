package edu.bab.libr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 24.04.2022 18:01
 * @class CoverController
 */
@RestController
public class CoverController {
    @GetMapping("/cover")
    String showCoverSheet() throws IOException {
        String html = new String(Files.readAllBytes(Paths.get("src/main/resources/static/cover.html")));
        System.out.println(html);
        String theme = "Бібліотека";
        return  html;
    }
}
