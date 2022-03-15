package com.example.detail_storage.repository;

import com.example.detail_storage.model.Technica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicaRepository extends JpaRepository<Technica, Long> {
}
