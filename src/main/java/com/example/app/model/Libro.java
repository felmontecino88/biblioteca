package com.example.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad JPA para representar un Libro en la base de datos Hibernate creará automáticamente la
 * tabla "libros" si no existe
 */

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isbn", nullable = false, length = 20)
    private String isbn;

    @Column(name = "titulo", nullable = false, length = 200)
    private String titulo;

    @Column(name = "editorial", nullable = false, length = 100)
    private String editorial;

    @Column(name = "fecha_publicacion", nullable = false)
    private int fechaPublicacion;

    @Column(name = "autor", nullable = false, length = 150)
    private String autor;
}
