package com.universidad.proyecto.gestionhospital.repository;

import com.universidad.proyecto.gestionhospital.domain.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
