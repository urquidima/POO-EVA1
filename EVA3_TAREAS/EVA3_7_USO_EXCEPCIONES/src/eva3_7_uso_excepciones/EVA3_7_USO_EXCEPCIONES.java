/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo =true; //EL USUARIO SIEMPRE SE EQUIVOCA
                Scanner input=new Scanner(System.in);
        do {
            try{
                System.out.println("Introduce tu edad");
                int edad=input.nextInt();
                System.out.println("Tu edad: "+edad);
                datoErroneo=false;
            }catch(InputMismatchException e){
                System.out.println(input.next()+" El dato introducido es invalido");
            }
            
        } while (datoErroneo);
                        
    }
    
}
