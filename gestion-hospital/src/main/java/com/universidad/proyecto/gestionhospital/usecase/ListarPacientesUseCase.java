package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Paciente;
import com.universidad.proyecto.gestionhospital.services.PacienteService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarPacientesUseCase {

    private final PacienteService pacienteService;

    public ListarPacientesUseCase(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public List<Paciente> ejecutar() {
        return pacienteService.getAll();
    }
}
