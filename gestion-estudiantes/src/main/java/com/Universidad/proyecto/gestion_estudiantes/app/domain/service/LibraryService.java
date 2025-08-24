package com.Universidad.proyecto.gestion_estudiantes.app.domain.service;

public class LibraryService {
    private String bookName;
    private String studentName;

    public LibraryService(String bookName, String studentName){
        this.bookName = bookName;
        this.studentName = studentName;
    }

    public void showInfo(){
        System.out.println("📚 Servicio de Biblioteca");
        System.out.println("Libro prestado: " + bookName);
        System.out.println("Estudiante: " + studentName);
    }
}
