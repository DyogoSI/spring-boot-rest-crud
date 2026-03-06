package com.dyogodev.vendacelulares.repository;

import com.dyogodev.vendacelulares.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelularRepository extends JpaRepository<Celular, Long> {
}