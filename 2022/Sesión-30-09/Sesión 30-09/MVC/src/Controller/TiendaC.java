/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TiendaM;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class TiendaC {

    TiendaM tiendaM = new TiendaM();

    public void AgregarC(double Compra) {
        try {
            if (Compra > 0) {
                tiendaM.setCompra(Compra);
                tiendaM.Agregar();
                JOptionPane.showMessageDialog(null, "Se agregó correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Dato no valido.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }

    public double[] Mostrar() {
        double data[] = new double[2];
        try {
            if (tiendaM.getTotal() != 0) {
                data[0]=tiendaM.getIncremento();
                data[1]=tiendaM.getTotal();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha efectuado compra.");
            }
            JOptionPane.showMessageDialog(null, "Se consultó correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return data;
    }
}
