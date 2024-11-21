package com.example.cicd_pipeline;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.awt.*;

@RestController
@RequestMapping(path = "cicd", produces = MediaType.APPLICATION_JSON_VALUE)
public class CicdController {

    @GetMapping
    public List<Object> search () {
        return List.of(new Cicd(1, "Belle formation", 1));
    }
}
