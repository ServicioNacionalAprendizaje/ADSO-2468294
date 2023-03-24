/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ariel
 */
public class Llanteria {

    private String NombreCliente;
    private double PrecioUnitario;
    private double PrecioBruto;
    private double PrecioNeto;
    private double Descuento;
    private int Cantidad;

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    private void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getPrecioBruto() {
        return PrecioBruto;
    }

    private void setPrecioBruto(double PrecioBruto) {
        this.PrecioBruto = PrecioBruto;
    }

    public double getPrecioNeto() {
        return PrecioNeto;
    }

    private void setPrecioNeto(double PrecioNeto) {
        this.PrecioNeto = PrecioNeto;
    }

    public double getDescuento() {
        return Descuento;
    }

    private void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void Calcular(){
                       
        if(this.getCantidad()<5){
            this.setPrecioUnitario(300);
        }else if(this.getCantidad()<=10){
            this.setPrecioUnitario(250);
        }else{
            this.setPrecioUnitario(200);
        }
        
        this.setPrecioBruto(this.getCantidad()*300);
        this.setDescuento(this.getPrecioBruto()-(this.getPrecioUnitario()*this.getCantidad()));
        this.setPrecioNeto(this.getPrecioBruto()-this.getDescuento());
        
        //Salida
        System.out.println("La compra de "+this.getNombreCliente()+", resumen: ");
        System.out.println("***********************************");
        System.out.println("Cantidad: "+this.getCantidad());
        System.out.println("Valor Unitario: "+this.getPrecioUnitario());
        System.out.println("Precio antes de descuento: "+this.getPrecioBruto());
        System.out.println("Precio neto: "+this.getPrecioNeto());
        System.out.println("Total descuento: "+this.getDescuento());
        System.out.println("Gracias por su compra.");
        
    }    
}
