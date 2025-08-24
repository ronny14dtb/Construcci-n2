package com.Universidad.proyecto.gestion_estudiantes.app.service;

import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import com.Universidad.proyecto.gestion_estudiantes.app.domain.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    private final EstudianteRepository repo;

    public EstudianteService(EstudianteRepository repo) { this.repo = repo; }

    public Estudiante crear(Estudiante e) { return repo.guardar(e); }
    public Optional<Estudiante> porId(Long id) { return repo.buscarPorId(id); }
    public List<Estudiante> listar() { return repo.listarTodos(); }
    public void eliminar(Long id) { repo.eliminar(id); }
}