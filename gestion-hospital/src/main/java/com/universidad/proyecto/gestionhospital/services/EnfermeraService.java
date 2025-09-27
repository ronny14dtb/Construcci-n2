package com.universidad.proyecto.gestionhospital.services;


import com.universidad.proyecto.gestionhospital.domain.model.Enfermera;
import com.universidad.proyecto.gestionhospital.repository.EnfermeraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermeraService {

    private final EnfermeraRepository enfermeraRepository;

    public EnfermeraService(EnfermeraRepository enfermeraRepository) {
        this.enfermeraRepository = enfermeraRepository;
    }

    public List<Enfermera> getAll() {
        return enfermeraRepository.findAll();
    }

    public Optional<Enfermera> getById(Long id) {
        return enfermeraRepository.findById(id);
    }

    public Enfermera save(Enfermera enfermera) {
        return enfermeraRepository.save(enfermera);
    }

    public void delete(Long id) {
        enfermeraRepository.deleteById(id);
    }
}
