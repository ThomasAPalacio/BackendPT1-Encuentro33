//Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
//La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos 
//y saber qué alumnos han recibido una nota por encima de ese promedio.
//Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre 
//y nota (representando la nota obtenida en el final). 
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes 
//con sus respectivas notas.
//Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos 
//tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
//Calcular y mostrar el promedio de notas de todo el curso
//Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
//Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
//Nota: para crear un vector de objetos la definición es la siguiente:
//Objeto nombreVector[] = new Objeto[];
package Ejercicios_Final;

import java.util.Scanner;

public class Ejercicio_Final {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EstudiantesServicio servicios = new EstudiantesServicio();

        double promedio = servicios.calcularPromedio();
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] nombres = servicios.notasMayoresPromedio();
        System.out.println("Alumnos con notas mayores al promedio:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Todos los estudiantes con notas mayores al promedio:");
        servicios.mostrarEstudiantesNotasMayoresAlPromedio();

    }
}
