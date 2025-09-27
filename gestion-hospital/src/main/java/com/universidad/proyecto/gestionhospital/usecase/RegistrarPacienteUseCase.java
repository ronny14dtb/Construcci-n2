package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Paciente;
import com.universidad.proyecto.gestionhospital.services.PacienteService;
import org.springframework.stereotype.Component;

@Component
public class RegistrarPacienteUseCase {

    private final PacienteService pacienteService;

    public RegistrarPacienteUseCase(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public Paciente ejecutar(Paciente paciente) {
        return pacienteService.save(paciente);
    }
}