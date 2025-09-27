package com.universidad.proyecto.gestionhospital.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermeras")
public class Enfermera extends Empleado {

    private String turno; // Ejemplo: "Día", "Noche"
    private String area;  // Ejemplo: "Urgencias", "Pediatría"

    // 🔹 Constructores
    public Enfermera() {}

    public Enfermera(String nombre, String apellido, String cargo, String documentoIdentidad,
                     String turno, String area) {
        super(nombre, apellido, cargo, documentoIdentidad);
        this.turno = turno;
        this.area = area;
    }

    // 🔹 Getters y Setters
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
}
