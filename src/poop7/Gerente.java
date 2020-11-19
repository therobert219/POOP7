/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;
/**
 *
 * @author Roberto Carlos
 */
public class Gerente extends Empleado{
    private int presupuesto;
   
    /**
     * 
     */

    public Gerente() {
    }
/**
 * 
 * @param presupuesto
 * @param nombre
 * @param numEmpleado
 * @param sueldo 
 */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
/**
 * 
 * @return presupuesto
 */
    public int getPresupuesto() {
        return presupuesto;
    }
/**
 * 
 * @param presupuesto 
 */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
   /**
    * 
    * @param anio
    * @param tasa 
    */ 
    public void setPresupuesto(int anio,float tasa) {
        this.presupuesto =(int)(presupuesto/tasa*anio);
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    

   
}
