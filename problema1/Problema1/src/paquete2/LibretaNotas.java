/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class LibretaNotas {

    private String nombreEstudiantes;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    
    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    public void establecernombreEstudiantes(String nom) {
        nombreEstudiantes = nom;
    }

    public void establecerCalificacion1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacion2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacion3(double c) {
        calificacion3 = c;
    }

    public void establecerPromedio() {
        double suma;
        suma = calificacion1 + calificacion2 + calificacion3;
        promedio = suma / 3;
    }

    public String obtenernombreEstudiantes() {
        return nombreEstudiantes;
    }

    public double obtnerCalificacion1() {
        return calificacion1;
    }

    public double obtnerCalificacion2() {
        return calificacion2;
    }

    public double obtnerCalificacion3() {
        return calificacion3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaciones\n"
                + "----------------------------------------------------------\n"
                + "Nombre del Estudiante: %s\n"
                + "Calficacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiantes, calificacion1, calificacion2, calificacion3,
                promedio);
        return cadena;
    }
}
