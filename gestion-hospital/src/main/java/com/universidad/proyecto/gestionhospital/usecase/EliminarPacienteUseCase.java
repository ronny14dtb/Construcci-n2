package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.services.PacienteService;
import org.springframework.stereotype.Component;

@Component
public class EliminarPacienteUseCase {

    private final PacienteService pacienteService;

    public EliminarPacienteUseCase(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public void ejecutar(Long id) {
        pacienteService.delete(id);
    }
}
