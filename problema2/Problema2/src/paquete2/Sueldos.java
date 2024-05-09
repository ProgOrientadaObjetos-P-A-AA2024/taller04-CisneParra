/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author natsu
 */
public class Sueldos {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Sueldos(String n, String a, double s, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = s;
        cedula = c;
    }
    public Sueldos(String n, String a, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = 500;
        cedula = c;
    }

    public void establecernombres(String nom) {
        nombre = nom;
    }

    public void establecerapellidos(String ap) {
        apellido = ap;
    }

    public void establecercedula(String ce) {
        cedula = ce;
    }

    public void establecersueldoBasico(double sueldo) {
        sueldoBasico = sueldo;
    }

    public void establecersueldoTotal() {
        double calculo = sueldoBasico * 0.2;
        sueldoTotal =(sueldoBasico + calculo);
    }

    public String obtenernombres() {
        return nombre;
    }

    public String obtenerapellidos() {
        return apellido;
    }

    public String obtenercedula() {
        return cedula;
    }

    public double obtenersueldoBasico() {
        return sueldoBasico;
    }

    public double obtenersueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informe de sueldos\n"
                + "-----------------------------------------------------------\n"
                + "Nombre completo: %s %s\n"
                + "Numero de cedula: %s\n"
                + "Sueldo basico: %.2f\n"
                + "Suelto total: %.2f\n"
                + "---------------------------------------------------------\n",
                nombre, apellido, cedula, sueldoBasico, sueldoTotal);
        return cadena;
    }
}
