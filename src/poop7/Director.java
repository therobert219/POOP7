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
public class Director extends Trabajador{
    private String Institucion;
    
    public Director(){
        
    }
/**
 * 
 * @param Institucion
 * @param Nombre
 * @param Apellido
 * @param Fecha_Nacimiento
 * @param Ocupacion
 * @param Salario
 * @param AntiguedadMeses 
 */
    public Director(String Institucion, String Nombre, String Apellido, int Fecha_Nacimiento, String Ocupacion, int Salario, int AntiguedadMeses) {
        super(Nombre, Apellido, Fecha_Nacimiento, Ocupacion, Salario, AntiguedadMeses);
        this.Institucion = Institucion;
    }
/**
 * 
 * @return Institucion
 */ 

    public String getInstitucion() {
        return Institucion;
    }
/**
 * 
 * @param Institucion 
 */
    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }
/**
 * 
 * @return "Director{" + "Institucion=" + Institucion + '}'
 */
    @Override
    public String toString() {
        return "Director{" + "Institucion=" + Institucion + '}';
    }
    
    
}