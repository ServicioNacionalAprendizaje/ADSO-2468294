/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroM;

/**
 *
 * @author ariel
 */
public class RegistroC {

    RegistroM registroM = new RegistroM();

    public void DataGuardar(String nombre, String apellido, Integer ficha, String correo, String telefono) {
        registroM.setNombre(nombre);
        registroM.setApellido(apellido);
        registroM.setFicha(ficha);
        registroM.setCorreo(correo);
        registroM.setTelefono(telefono);
        registroM.Crear();
    }

    public void DataModificar(Integer id, String nombre, String apellido, Integer ficha, String correo, String telefono) {
        registroM.setId(id);
        registroM.setNombre(nombre);
        registroM.setApellido(apellido);
        registroM.setFicha(ficha);
        registroM.setCorreo(correo);
        registroM.setTelefono(telefono);
        registroM.Modificar();
    }

    public void DataConsultar() {

    }

    public void DataEliminar(Integer id) {
        registroM.setId(id);
        registroM.Eliminar();
    }
}
