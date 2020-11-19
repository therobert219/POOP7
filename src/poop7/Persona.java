/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;
/**
 *
 * @author angel
 */
public class Persona {
    String Nombre;
    private String Apellido;
    private int  Fecha_Nacimiento;

    public Persona() {
        System.out.println("Se ha creado el Objeto Persona");
    }

    /**
     * 
     * @param Nombre
     * @param Apellido
     * @param Fecha_Nacimiento 
     */
    public Persona(String Nombre, String Apellido, int Fecha_Nacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    /**
     * 
     * @return Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * 
     * @param Nombre 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * 
     * @return Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * 
     * @param Apellido 
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * 
     * @return Fecha_Nacimiento
     */
    public int getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    /**
     * 
     * @param Fecha_Nacimiento 
     */
    public void setFecha_Nacimiento(int Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    /**
     * 
     * @return Persona (Nombre,Apellido, Fecha_Nacimiento)
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Fecha_Nacimiento=" + Fecha_Nacimiento + '}';
    }
}