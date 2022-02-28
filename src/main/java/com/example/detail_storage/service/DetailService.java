package com.example.detail_storage.service;

import com.example.detail_storage.model.Detail;
import com.example.detail_storage.repository.DetailRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DetailService {
    private final DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public Collection<Detail> getAll() {
        //дополнительная бизнес логика
        return detailRepository.findAll();
    }
}
