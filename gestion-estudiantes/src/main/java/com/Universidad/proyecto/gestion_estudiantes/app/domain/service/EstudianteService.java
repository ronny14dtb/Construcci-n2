package com.Universidad.proyecto.gestion_estudiantes.app.domain.service;


import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import com.Universidad.proyecto.gestion_estudiantes.app.domain.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    // Constructor con inyección de dependencias
    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public Estudiante guardar(Estudiante estudiante) {
        return repository.guardar(estudiante);
    }

    public Optional<Estudiante> buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    public List<Estudiante> listarTodos() {
        return repository.listarTodos();
    }

    public void eliminar(Long id) {
        repository.eliminar(id);
    }
}
