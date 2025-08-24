package com.Universidad.proyecto.gestion_estudiantes.app.domain.service;


public class EnrollmentService {
    private String studentName;
    private String program;

    public EnrollmentService(String studentName, String program){
        this.studentName = studentName;
        this.program = program;
    }

    public void showInfo(){
        System.out.println("📝 Servicio de Matrícula");
        System.out.println("Estudiante: " + studentName);
        System.out.println("Programa: " + program);
    }
}
