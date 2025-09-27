package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Medico;
import com.universidad.proyecto.gestionhospital.services.MedicoService;
import org.springframework.stereotype.Component;

@Component
public class RegistrarMedicoUseCase {

    private final MedicoService medicoService;

    public RegistrarMedicoUseCase(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    public Medico ejecutar(Medico medico) {
        return medicoService.save(medico);
    }
}
