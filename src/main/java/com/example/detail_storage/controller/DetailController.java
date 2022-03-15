package com.example.detail_storage.controller;

import com.example.detail_storage.model.Detail;
import com.example.detail_storage.service.DetailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/detail")
public class DetailController {

    // доступ к detailService;
    private final DetailService detailService;

    // автоматическое внедрение экземпляра класса через конструктор
    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/details")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Detail> getAllDetails() {
        return detailService.getAll();
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Detail findById(@PathVariable Long id) {
        return detailService.findByID(id);
    }

}
