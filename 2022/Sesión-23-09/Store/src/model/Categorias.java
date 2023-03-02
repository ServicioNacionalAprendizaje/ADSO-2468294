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
public class Categorias implements CRUD {

    private int Codigo;
    private String Nombre;

    public Categorias() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
