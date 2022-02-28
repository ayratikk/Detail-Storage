package com.example.detail_storage.controller;

import com.example.detail_storage.model.Detail;
import com.example.detail_storage.model.Technica;
import com.example.detail_storage.service.DetailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AppController {
    private final DetailService detailService;

    public AppController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/hello")
    public String helloPage() {

        return "hello";
    }

    @GetMapping("/details")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Detail> getAllDetails() {
        return detailService.getAll();
    }

//    @GetMapping("/technics")
//    @ResponseStatus(HttpStatus.OK)
//    public Collection<Technica> getAllTechnics) {
//        return detailService.getAll();
//    }
}


