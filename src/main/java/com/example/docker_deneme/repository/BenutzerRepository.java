package com.example.docker_deneme.repository;

import com.example.docker_deneme.entity.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenutzerRepository extends JpaRepository<Benutzer,Long> {
}
