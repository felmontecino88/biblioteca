package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
