package com.universidad.proyecto.gestionhospital.usecase;

import com.universidad.proyecto.gestionhospital.domain.model.Enfermera;
import com.universidad.proyecto.gestionhospital.services.EnfermeraService;
import org.springframework.stereotype.Component;

@Component
public class RegistrarEnfermeraUseCase {

    private final EnfermeraService enfermeraService;

    public RegistrarEnfermeraUseCase(EnfermeraService enfermeraService) {
        this.enfermeraService = enfermeraService;
    }

    public Enfermera ejecutar(Enfermera enfermera) {
        return enfermeraService.save(enfermera);
    }
}
