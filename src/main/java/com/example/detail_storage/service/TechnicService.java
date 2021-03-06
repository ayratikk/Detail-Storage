package com.example.detail_storage.service;

import com.example.detail_storage.model.Technica;
import com.example.detail_storage.repository.TechnicaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TechnicService {

    private final TechnicaRepository technicaRepository;

    public TechnicService(TechnicaRepository technicaRepository) {
        this.technicaRepository = technicaRepository;
    }

    public Collection<Technica> getAll() {
        //дополнительная бизнес логика
        return technicaRepository.findAll();
    }

    // получение техники по айди
    public Technica findById(Long id) {
        return technicaRepository.findById(id).get();

    }
}
