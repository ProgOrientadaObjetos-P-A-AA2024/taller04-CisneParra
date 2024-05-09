/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Cheques;
/**
 *
 * @author natsu
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheques cheque1 = new Cheques("Irene Delgado","Banco de Loja",1500);
        Cheques cheque2 = new Cheques("Soledad Torres",12000);
        cheque1.establecercomision();
        cheque2.establecercomision();
        System.out.printf("%s", cheque1);
        System.out.printf("%s", cheque2);
    }
    
}
