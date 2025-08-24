package com.Universidad.proyecto.gestion_estudiantes.app.domain.service;

public class TutoringService {
    private String tutorName;
    private String subject;

    public TutoringService(String tutorName, String subject){
        this.tutorName = tutorName;
        this.subject = subject;
    }

    public void showInfo(){
        System.out.println("👩‍🏫 Servicio de Tutoría");
        System.out.println("Tutor: " + tutorName);
        System.out.println("Materia: " + subject);
    }
}
