package com.Universidad.proyecto.gestion_estudiantes.app.infrastructure.controller;

import com.Universidad.proyecto.gestion_estudiantes.app.domain.model.Estudiante;
import com.Universidad.proyecto.gestion_estudiantes.app.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) { this.service = service; }

    @GetMapping
    public List<Estudiante> listar() { return service.listar(); }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) { return service.crear(e); }
}