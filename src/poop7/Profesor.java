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
public class Profesor extends Trabajador{
    private String Materia;
    
    public Profesor(){
    /**
     * 
     */   
    }

    public Profesor(String Materia, String Nombre, String Apellido, int Fecha_Nacimiento, String Ocupacion, int Salario, int AntiguedadMeses) {
        super(Nombre, Apellido, Fecha_Nacimiento, Ocupacion, Salario, AntiguedadMeses);
        this.Materia = Materia;
    }

    /**
     * 
     * @return Materia
     */
     
    public String getMateria() {
        return Materia;
    }
    /**
     * 
     * @param Materia 
     */
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
/**
 * 
 * @return "Profesor{" + "Materia=" + Materia + '}'
 */
    @Override
    public String toString() {
        return "Profesor{" + "Materia=" + Materia + '}';
    }
    
    
}