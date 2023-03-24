/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ariel
 */
public class Inversion {
    private double Presupuesto;
    private double Genecologia;
    private double Tramatologia;
    private double Pediatria;

    public Inversion() {
    }

    public Inversion(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    private double getPresupuesto() {
        return Presupuesto;
    }

    private void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    private double getGenecologia() {
        return Genecologia;
    }

    private void setGenecologia(double Genecologia) {
        this.Genecologia = Genecologia;
    }

    private double getTramatologia() {
        return Tramatologia;
    }

    private void setTramatologia(double Tramatologia) {
        this.Tramatologia = Tramatologia;
    }

    private double getPediatria() {
        return Pediatria;
    }

    private void setPediatria(double Pediatria) {
        this.Pediatria = Pediatria;
    }
    
    private void Calcular(){
        this.setGenecologia(this.getPresupuesto()*0.4);
        this.setTramatologia(this.getPresupuesto()*0.3);
        this.setPediatria(this.getPresupuesto()*0.3);
    }
    
    public void VerReporte(){
        this.Calcular();
        System.out.println("Presupuesto: "+this.getPresupuesto());
        System.out.println("***************************");
        System.out.println("Genecologia: "+this.getGenecologia());
        System.out.println("Tramatologia: "+this.getTramatologia());
        System.out.println("Pediatria: "+this.getPediatria());
    }
}
