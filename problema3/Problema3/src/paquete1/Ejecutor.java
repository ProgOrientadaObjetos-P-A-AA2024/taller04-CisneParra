/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Matriculas;

/**
 *
 * @author natsu
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriculas auto1 = new Matriculas("1100118855", "ford", 2024, 15000);
        Matriculas auto2 = new Matriculas("115558500", 2021, 20000);
        auto1.establecervalorMatricula();
        auto2.establecervalorMatricula();
        System.out.printf("%s", auto1);
        System.out.printf("%s", auto2);
    }

}
