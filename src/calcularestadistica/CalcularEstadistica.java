/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




package calcularestadistica;
import java.util.Scanner;
/**
 *
 * @author labctr
 */

    

public class CalcularEstadistica {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = ingresar.nextLine();
        Curso curso = new Curso(nombreCurso);

        System.out.println("Cuantos estudiantes tiene el curso?");
        int numEstudiantes = ingresar.nextInt();
        ingresar.nextLine();  // Consume newline left-over

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese el semestre del estudiante " + (i + 1) + ":");
            int semestre = ingresar.nextInt();

            System.out.println("Ingrese la nota final del estudiante " + (i + 1) + ":");
            Float nota = ingresar.nextFloat();
            ingresar.nextLine();  // Consume newline left-over

            Estudiante estudiante = new Estudiante(semestre, nota);
            curso.agregarEstudiante(estudiante);
        }
        
        System.out.println("Estudiantes aprobados: " + curso.getAprobados());
        System.out.println("Estudiantes desaprobados: " + curso.getDesaprobados());
        System.out.println("Promedio del curso: " + curso.getcursoProm());
        System.out.println("El semestre con mayor cantidad de estudiantes en el curso es: " + curso.getsemestreProm());

        
    }
}

        
    
    

