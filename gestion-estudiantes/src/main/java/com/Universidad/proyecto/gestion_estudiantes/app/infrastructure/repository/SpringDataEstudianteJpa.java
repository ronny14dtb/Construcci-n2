package com.Universidad.proyecto.gestion_estudiantes.app.infrastructure.repository;

import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataEstudianteJpa extends JpaRepository<Estudiante, Long> {
}
