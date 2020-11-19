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
public class Alumno extends Persona {
    private int  Promedio;
    private String Escolaridad;
    /**
     * 
     */
    public Alumno(){
        
    }
/**
 * 
 * @param Nombre
 * @param Apellido
 * @param Fecha_Nacimiento
 * @param Promedio
 * @param Escolaridad 
 */    
    public Alumno(String Nombre,String Apellido,int Fecha_Nacimiento,int Promedio, String Escolaridad){
        super(Nombre, Apellido,Fecha_Nacimiento);
        this.Promedio=Promedio;
        this.Escolaridad=Escolaridad;
    }
/**
 * 
 * @return Promedio
 */
    public int getPromedio() {
        return Promedio;
    }
/**
 * 
 * @param Promedio 
 */
    public void setPromedio(int Promedio) {
        this.Promedio = Promedio;
    }
/**
 * 
 * @return Escolaridad
 */
    public String getEscolaridad() {
        return Escolaridad;
    }
/**
 * 
 * @param Escolaridad 
 */
    public void setEscolaridad(String Escolaridad) {
        this.Escolaridad = Escolaridad;
    }
/**
 * 
 * @return  "Alumno{" + "Promedio=" + Promedio + ", Escolaridad=" + Escolaridad + '}'
 */
    @Override
    public String toString() {
        return "Alumno{" + "Promedio=" + Promedio + ", Escolaridad=" + Escolaridad + '}';
    }
    
    
}