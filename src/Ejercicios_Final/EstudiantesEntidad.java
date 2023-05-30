package Ejercicios_Final;

import java.util.Scanner;

public class EstudiantesEntidad {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombres;
    private double notas;
    
    public EstudiantesEntidad() {
    }

    public EstudiantesEntidad(String nombres, double notas) {
        this.nombres = nombres;
        this.notas = notas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    
    
}

