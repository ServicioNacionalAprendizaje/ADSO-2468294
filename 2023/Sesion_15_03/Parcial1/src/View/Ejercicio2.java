/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Inversion;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double Presupuesto=0;
        do {
            System.out.print("Digite el presupuesto asignado: ");
            try {                
                Presupuesto = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Dato no válido, favor solo saldo positivo.");
            }
        } while (Presupuesto<=0);
        
        Inversion inversion = new Inversion(Presupuesto);        
        inversion.VerReporte();
    }
}
