package com.Universidad.proyecto.gestion_estudiantes.app.infrastructure.repository;

import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import com.Universidad.proyecto.gestion_estudiantes.app.domain.repository.EstudianteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepositoryAdapter implements EstudianteRepository {

    private final SpringDataEstudianteJpa jpa;

    public EstudianteRepositoryAdapter(SpringDataEstudianteJpa jpa) {
        this.jpa = jpa;
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return jpa.save(estudiante);
    }

    @Override
    public Optional<Estudiante> buscarPorId(Long id) {
        return jpa.findById(id);
    }

    @Override
    public List<Estudiante> listarTodos() {
        return jpa.findAll();
    }

    @Override
    public void eliminar(Long id) {
        jpa.deleteById(id);
    }
}
