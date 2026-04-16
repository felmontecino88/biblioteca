package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.model.Libro;
import com.example.app.repository.LibroRepository;

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.findById(id).orElse(null);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.deleteById(id);
        return "Libro eliminado";
    }

    
}
