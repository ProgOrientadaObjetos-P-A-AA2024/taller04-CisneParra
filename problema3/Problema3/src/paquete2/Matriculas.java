/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author natsu
 */
public class Matriculas {

    private String marca;
    private double valorMatricula;
    private double valorAuto;
    private String cedula;
    private int year;

    public Matriculas(String c, String m, int a, double vv) {
        cedula = c;
        marca = m;
        year = a;
        valorAuto = vv;
    }

    public Matriculas(String c, int a, double vv) {
        cedula = c;
        marca = "Fabia";
        year = a;
        valorAuto = vv;
    }

    public void establecercedula(String ce) {
        cedula = ce;
    }

    public void estableceryear(int a) {
        year = a;
    }

    public void establecermarca(String m) {
        marca = m;
    }

    public void establecervalorAuto(double v) {
        valorAuto = v;
    }

    public void establecervalorMatricula() {
        double calculo = valorAuto * 0.00002;
        valorMatricula = (calculo * year);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public double obtenervalorAuto() {
        return valorAuto;
    }

    public double obtenervalorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informe de matricula del auto\n"
                + "--------------------------------------------------------\n"
                + "Cedula del propietario: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor total de la matricula: %.2f\n"
                + "-------------------------------------------------------\n",
                cedula, marca, year, valorAuto, valorMatricula);
        return cadena;
    }
}
