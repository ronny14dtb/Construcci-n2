package com.universidad.proyecto.gestionhospital.repository;

import com.universidad.proyecto.gestionhospital.domain.model.Enfermera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeraRepository extends JpaRepository<Enfermera, Long> {
}
