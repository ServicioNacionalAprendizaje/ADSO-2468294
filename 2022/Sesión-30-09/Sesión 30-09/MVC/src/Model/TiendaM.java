/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ariel
 */
public class TiendaM {
    private double Compra;
    private double Incremento;
    private double Total;

    public TiendaM() {
    }

    public double getCompra() {
        return Compra;
    }

    public void setCompra(double Compra) {
        this.Compra = Compra;
    }

    public double getIncremento() {
        return Incremento;
    }

    public void setIncremento(double Incremento) {
        this.Incremento = Incremento;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }  
    
    public void Agregar(){
        this.setIncremento(this.getCompra()*0.1);
        this.setTotal(this.getCompra()+this.getIncremento());
    }
}
