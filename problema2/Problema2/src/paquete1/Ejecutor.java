/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Sueldos;
/**
 *
 * @author natsu
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sueldos maestro1 = new Sueldos("Rene","Elizalde",1500,"1100445599");
        Sueldos maestro2 = new Sueldos("Rene","Elizalde","1100445599");
        maestro1.establecersueldoTotal();
        maestro2.establecersueldoTotal();
        System.out.printf("%s", maestro1);
        System.out.printf("%s", maestro2);

    }
    
}
