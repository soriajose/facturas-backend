package com.example.demo.repository;

import com.example.demo.model.DetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleRepository extends JpaRepository<DetalleEntity, Integer> {
}
