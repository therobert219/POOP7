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
public class Trabajador extends Persona{
    private String Ocupacion;
    private int Salario;
    private int AntiguedadMeses;
    
    public Trabajador(){
        
    }
    /**
     * 
     * @param Nombre
     * @param Apellido
     * @param Fecha_Nacimiento
     * @param Ocupacion
     * @param Salario
     * @param AntiguedadMeses 
     */
    public Trabajador(String Nombre, String Apellido,int Fecha_Nacimiento, String Ocupacion, int Salario,int AntiguedadMeses){
        super(Nombre,Apellido,Fecha_Nacimiento);
        this.Ocupacion=Ocupacion;
        this.Salario=Salario;
        
    }
    /**
     * 
     * @return ocupacion
     */

    public String getOcupacion() {
        return Ocupacion;
    }
    /**
     * 
     * @param Ocupacion 
     */

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
    /**
     * 
     * @return salario
     */

    public int getSalario() {
        return Salario;
    }
    /**
     * 
     * @param Salario 
     */

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    /**
     * 
     * @return AntiguedadMeses
     */

    public int getAntiguedadMeses() {
        return AntiguedadMeses;
    }
    /**
     * 
     * @param AntiguedadMeses 
     */

    public void setAntiguedadMeses(int AntiguedadMeses) {
        this.AntiguedadMeses = AntiguedadMeses;
    }
    /**
     * 
     * @return "Trabajador{" + "Nombre=" + Nombre + ", Ocupacion=" + Ocupacion + ", Salario=" + Salario + ", AntiguedadMeses=" + AntiguedadMeses + '}'
     */

    @Override
    public String toString() {
        return "Trabajador{" + "Nombre=" + Nombre + ", Ocupacion=" + Ocupacion + ", Salario=" + Salario + ", AntiguedadMeses=" + AntiguedadMeses + '}';
    }
    
    
}