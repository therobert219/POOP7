/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;
/**
 *
 * @author Luis Humberto
 */
public class POOP7 {
    
     public static void main(String[] args) {
        System.out.println("1***************************************");
        Empleado empleado=new Empleado();
        empleado.setNombre("angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("2***************************************");
        Gerente gerente1=new Gerente();
        gerente1.setNombre("cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("nombre: "+gerente1.getNombre());
        System.out.println("numEmpleado: "+gerente1.getNumEmpleado());
        System.out.println("sueldo: "+gerente1.getSueldo());
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("3***************************************");
        
        Gerente gerente2=new Gerente(88,"julio",200000,500000);
          
        System.out.println("nombre: "+gerente2.getNombre());
        System.out.println("numEmpleado: "+gerente2.getNumEmpleado());
        System.out.println("sueldo: "+gerente2.getSueldo());
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        // TODO code application logic here}
     
        
        System.out.println("4***************************************");
        //sobreescritura
        System.out.println(gerente2);
         
        System.out.println("5***************************************");
        //sobrecarga
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println(" ==============={ 6 }==============");
        
        Persona desconocido = new Persona();
        desconocido.setNombre("Pablo");
        desconocido.setApellido("Rios");
        desconocido.setFecha_Nacimiento(15021922);
        System.out.println(desconocido);
        
        System.out.println(" ==============={ 7 }==============");
        Alumno estudiante = new Alumno();
        estudiante.setNombre("Alfredo");
        estudiante.setApellido("Portillo");
        estudiante.setPromedio(10);
        estudiante.setEscolaridad("Pimaria");
        System.out.println("Nombre: " +estudiante.getNombre()+ "Apellido: " + estudiante.getApellido());
        System.out.println(estudiante);
        
        System.out.println(" ==============={ 8 }==============");
        Trabajador obrero = new Trabajador("Samuel", "Marquez", 21081982, "Albañil", 1000, 3 );
        System.out.println("Nombre: " + obrero.getNombre()+ "Apellido: " + obrero.getApellido());
        System.out.println("Fecha: " + obrero.getFecha_Nacimiento());
        System.out.println("Ocupacion: " + obrero.getOcupacion());
        System.out.println("Salario: " + obrero.getSalario());
        System.out.println("Antiguedad en meses: " + obrero.getAntiguedadMeses());
        
        System.out.println(" ==============={ 9 }==============");
        Profesor maestro = new Profesor("Matematicas", "Gabriel", "Hernandez", 18091993, "Profesor", 10000, 24 );
        System.out.println("Nombre: " + maestro.getNombre()+ "Apellido: " + maestro.getApellido());
        System.out.println("Fecha: " + maestro.getFecha_Nacimiento());
        System.out.println("Ocupacion: " + maestro.getOcupacion());
        System.out.println("Salario: " + maestro.getSalario());
        System.out.println("Antiguedad en meses: " + maestro.getAntiguedadMeses());
        System.out.println("Materia: " + maestro.getMateria());
        
        System.out.println(" ==============={ 10 }==============");
        Director directivo = new Director("2 de Marzo", "Mario", "Quintana", 23121954, "Director", 20000, 36 );
        System.out.println("Nombre: " + directivo.getNombre()+ "Apellido: " + maestro.getApellido());
        System.out.println("Fecha: " + directivo.getFecha_Nacimiento());
        System.out.println("Ocupacion: " + directivo.getOcupacion());
        System.out.println("Salario: " + directivo.getSalario());
        System.out.println("Antiguedad en meses: " + directivo.getAntiguedadMeses());
        System.out.println("Institucion de la que es director: " + directivo.getInstitucion());
    
     }
}
