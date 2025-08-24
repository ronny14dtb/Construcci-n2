package com.Universidad.proyecto.gestion_estudiantes.app.domain.repository;

import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import java.util.List;
import java.util.Optional;

public interface EstudianteRepository {
    Estudiante guardar(Estudiante estudiante);
    Optional<Estudiante> buscarPorId(Long id);
    List<Estudiante> listarTodos();
    void eliminar(Long id);
}