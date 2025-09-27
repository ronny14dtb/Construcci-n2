package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Paciente;
import com.universidad.proyecto.gestionhospital.services.PacienteService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarPacientePorIdUseCase {

    private final PacienteService pacienteService;

    public BuscarPacientePorIdUseCase(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public Optional<Paciente> ejecutar(Long id) {
        return pacienteService.getById(id);
    }
}
