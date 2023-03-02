/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Conexion.Conexion;
import Interfase.Crud;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class RegistroM implements Crud{

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer ficha;
    private String correo;
    private String telefono;

    public RegistroM() {
    }

    Conexion conn = new Conexion();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getFicha() {
        return ficha;
    }

    public void setFicha(Integer ficha) {
        this.ficha = ficha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void Crear() {
       String sql ="INSERT INTO registro(" +
                            " nombre," +
                            " apellido," +
                            " ficha," +
                            " correo," +
                            " telefono" +
                        ")VALUES(" +
                            " '"+this.getNombre()+"'," +
                            " '"+this.getApellido()+"'," +
                            " "+this.getFicha()+"," +
                            " '"+this.getCorreo()+"'," +
                            " '"+this.getTelefono()+"' );";
       this.conn.EjecutarQuery(sql);
    }

    @Override
    public void Modificar() {
        String sql="UPDATE registro SET"
                + " nombre = '"+getNombre()+"',"
                + " apellido = '"+getApellido()+"',"
                + " ficha = "+getFicha()+","
                + " correo = '"+getCorreo()+"',"
                + " telefono = '"+getTelefono()+"'"
                + " WHERE id = "+getId()+";";
        this.conn.EjecutarQuery(sql);
       JOptionPane.showMessageDialog(null, "Datos actualizado con éxito.");
    }

    @Override
    public void Consultar() {
       
    }

    @Override
    public void ConsultarId() {
       
    }

    @Override
    public void Eliminar() {
       String sql = "DELETE FROM registro WHERE id = "+getId()+";";       
       this.conn.EjecutarQuery(sql);
       JOptionPane.showMessageDialog(null, "Registro Elimiando con éxito");
    }
    
}
