package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Enfermera;
import com.universidad.proyecto.gestionhospital.services.EnfermeraService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarEnfermerasUseCase {

    private final EnfermeraService enfermeraService;

    public ListarEnfermerasUseCase(EnfermeraService enfermeraService) {
        this.enfermeraService = enfermeraService;
    }

    public List<Enfermera> ejecutar() {
        return enfermeraService.getAll();
    }
}
