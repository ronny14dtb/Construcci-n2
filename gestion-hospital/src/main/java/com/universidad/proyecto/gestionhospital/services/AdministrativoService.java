package com.universidad.proyecto.gestionhospital.services;


import com.universidad.proyecto.gestionhospital.domain.model.Administracion;
import com.universidad.proyecto.gestionhospital.repository.AdministrativoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministracionService {

    private final AdministracionRepository administracionRepository;

    public AdministracionService(AdministracionRepository administracionRepository) {
        this.administracionRepository = administracionRepository;
    }

    public List<Administracion> getAll() {
        return administracionRepository.findAll();
    }

    public Optional<Administracion> getById(Long id) {
        return administracionRepository.findById(id);
    }

    public Administracion save(Ad
