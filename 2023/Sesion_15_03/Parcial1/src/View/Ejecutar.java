/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Llanteria;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Cantidad=0;
        String Nombre;
        
        
        System.out.print("Digite nombre del cliente: ");
        Nombre = scanner.nextLine();
        
        do {
            System.out.print("Digite la cantidad, esta debe ser mayor a 0: ");
            try {                
                Cantidad = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Dato no válido, favor solo ingresar números.");
            }
        } while (Cantidad<=0);
        
        Llanteria llanteria = new Llanteria();
        llanteria.setCantidad(Cantidad);
        llanteria.setNombreCliente(Nombre);
        llanteria.Calcular();
    }
}
