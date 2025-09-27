package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Medico;
import com.universidad.proyecto.gestionhospital.services.MedicoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarMedicosPorEspecialidadUseCase {

    private final MedicoService medicoService;

    public ListarMedicosPorEspecialidadUseCase(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    public List<Medico> ejecutar(String especialidad) {
        return medicoService.findByEspecialidad(especialidad);
    }
}
