/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularestadistica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author labctr
 */
public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;
 
    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    public int getAprobados() {
        int aprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() >= 14) {
                aprobados++;
            }
        }
        return aprobados;
    }
    public int getDesaprobados() {
        int desaprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() < 14) {
                desaprobados++;
            }
        }
        return desaprobados;
    }
    public float getcursoProm() {
        float suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.size();
    }
    public int getsemestreProm() {
        Map<Integer, Integer> frecuenciaSemestres = new HashMap<>();
        for (Estudiante estudiante : estudiantes) {
            frecuenciaSemestres.put(estudiante.getSemestre(), frecuenciaSemestres.getOrDefault(estudiante.getSemestre(), 0) + 1);
        }
        return Collections.max(frecuenciaSemestres.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}
