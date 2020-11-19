/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;
/**

 * @author Roberto Carlos
 */
public class Empleado {
    private String nombre;
    private int numEmpleado,sueldo;

    public Empleado() {
    }
/**
 * 
 * @param nombre
 * @param numEmpleado
 * @param sueldo 
 */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
   /**
    * 
    * @return 
    */ 
    
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return 
 */
    public int getNumEmpleado() {
        return numEmpleado;
    }
/**
 * 
 * @param numEmpleado 
 */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
/**
 * 
 * @return 
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * 
 * @param sueldo 
 */
    public void setSueldo(int sueldo) {
        if(sueldo>=0)
            this.sueldo = sueldo;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
   /**
    * 
    * @param porcentaje
    * @return sueldo
    */ 
    public int aumentarSueldo(int porcentaje){
    sueldo+=(int)(sueldo*porcentaje/100);
    return sueldo;
    }
    
    
}
