/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularestadistica;

/**
 *
 * @author labctr
 */
public class Estudiante {
  private int semestre;
  private float nota;
  public Estudiante(int semestre, float nota){
      this.semestre=semestre;
      this.nota=nota; 
  }
  public int getSemestre() {
        return semestre;
    }
  public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
  public float getNota() {
        return nota;
    }
  public void setNota(float nota) {
        this.nota = nota;
    }

   


}
