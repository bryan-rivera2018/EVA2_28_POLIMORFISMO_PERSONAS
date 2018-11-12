
import Persona.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado eEmp = new Empleado();
       eEmp.setNombre("JUAN");
       eEmp.setApellido("PEREZ");
       eEmp.setRFC("18550367");
       
       Alumno aAlu = new Alumno();
       aAlu.setNombre("BRYAN");
       aAlu.setApellido("RIVERA");
       aAlu.setnumControl("18550367");
           
       imprimirDatos(eEmp);
       imprimirDatos(aAlu);
    }
    public static void imprimirDatos(Persona pPerso){
        pPerso.ImprimirNombre();
    }
}

