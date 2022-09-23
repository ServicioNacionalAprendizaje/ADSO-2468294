/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfase.CRUD;

/**
 *
 * @author ariel
 */
public class Inventario implements CRUD{

    private int Codigo;
    private double ValorUnitario;
    private int Cantidad;
    private String UnidadMedida;
    private Productos Productos;
    private Marcas Marcas;
    private Categorias Categorias;

    public Inventario() {
    }

    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public Productos getProductos() {
        return Productos;
    }

    public void setProductos(Productos Productos) {
        this.Productos = Productos;
    }

    public Marcas getMarcas() {
        return Marcas;
    }

    public void setMarcas(Marcas Marcas) {
        this.Marcas = Marcas;
    }

    public Categorias getCategorias() {
        return Categorias;
    }

    public void setCategorias(Categorias Categorias) {
        this.Categorias = Categorias;
    }

    @Override
    public void Agregar() {
      
    }

    @Override
    public void Modificar() {
       
    }

    @Override
    public void Eliminar() {
      
    }

    @Override
    public void Consultar() {
       
    }    
}
