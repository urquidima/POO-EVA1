/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_copia_objetos;

/**
 *
 * @author alox1
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1=new Prueba();
        System.out.println("Direccion: "+obj1);
        obj1.x=100;
        System.out.println("Valor de x en obj1= " +obj1.x);
        //Prueba respaldo=obj1;
        Prueba respaldo=new Prueba();
        respaldo.x=obj1.x;
        System.out.println("Valor de x en respaldo = "+respaldo.x);
        //MODIFICO EL RESPALDO
        respaldo.x=0;
        System.out.println("Valor de x en obj1= " +obj1.x);
        System.out.println("Valor de x en respaldo = "+respaldo.x);
        //IMPRIMIR DIRECCIONES DE MEMORIA
        System.out.println("obj1= "+obj1);
        System.out.println("respaldo= "+respaldo);
        if(obj1==respaldo){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("SON DIFERENTES");
        }
    }
    
}

class Prueba{
    public int x;
}
