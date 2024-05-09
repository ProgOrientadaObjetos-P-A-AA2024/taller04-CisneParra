/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author natsu
 */
public class Cheques {

    private String nombre;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheques(String n, String b, double v) {
        nombre = n;
        nombreBanco = b;
        valor = v;
    }

    public Cheques(String n, double v) {
        nombre = n;
        nombreBanco = "Pichincha";
        valor = v;
    }

    public void establecernombre(String nom) {
        nombre = nom;
    }

    public void establecerBanco(String b) {
        nombreBanco = b;
    }

    public void establecervalor(double v) {
        valor = v;
    }

    public void establecercomision() {
        comision = valor * 0.00003;
    }

    public String obtenernombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return nombreBanco;
    }

    public double obtenervalor() {
        return valor;
    }

    public double obtenercomision() {
        return comision;
    }

    @Override

    public String toString() {
        String cadena = String.format("Informe de cheques:\n"
                + "----------------------------------------------------------\n"
                + "Nombre del cliente: %s\n"
                + "Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n"
                + "---------------------------------------------------------\n",
                 nombre, nombreBanco, valor, comision);
        return cadena;
    }
}
