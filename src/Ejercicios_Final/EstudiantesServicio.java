package Ejercicios_Final;

import java.util.Scanner;

public class EstudiantesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EstudiantesEntidad[] estudianteobj = new EstudiantesEntidad[8];

    public void crearEstudiante() {

//        for (int i = 0; i < estudianteobj.length; i++) {
//            System.out.println("Ingrese el nombre y su nota del estudiante N°" + (i + 1));
//            estudianteobj[0 + 1] = new EstudiantesEntidad(leer.next(), leer.nextDouble());
//        }
        estudianteobj[0] = new EstudiantesEntidad("Juan", 6.5);
        estudianteobj[1] = new EstudiantesEntidad("Maria", 7.2);
        estudianteobj[2] = new EstudiantesEntidad("Pedro", 9.8);
        estudianteobj[3] = new EstudiantesEntidad("Laura", 8.1);
        estudianteobj[4] = new EstudiantesEntidad("Carlos", 6.9);
        estudianteobj[5] = new EstudiantesEntidad("Ana", 5.7);
        estudianteobj[6] = new EstudiantesEntidad("Jorge", 9.3);
        estudianteobj[7] = new EstudiantesEntidad("Luisa", 8.5);

    }

    public double calcularPromedio() {
        double acum = 0.0;

        for (EstudiantesEntidad estudianteobj : estudianteobj) {
            acum += estudianteobj.getNotas();
        }

        return (acum / estudianteobj.length);

    }

    public String[] notasMayoresPromedio() {
        double prom = calcularPromedio();
        int count = 0;

        for (EstudiantesEntidad estudianteobj : estudianteobj) {
            if (estudianteobj.getNotas() > prom) {
                count++;
            }
        }
        String[] nombres = new String[count];
        int index = 0;
        for (EstudiantesEntidad estudianteobj : estudianteobj) {
            if (estudianteobj.getNotas() > prom) {
                nombres[index] = estudianteobj.getNombres();
                index++;
            }
        }

        return nombres;
    }

    public void mostrarEstudiantesNotasMayoresAlPromedio() {
        double prom = calcularPromedio();

        for (EstudiantesEntidad estudianteobj : estudianteobj) {
            if (estudianteobj.getNotas() > prom) {
                System.out.println("El estudiante: " + estudianteobj.getNombres() + " su nota es: " + estudianteobj.getNotas());
            }
        }

    }
}
