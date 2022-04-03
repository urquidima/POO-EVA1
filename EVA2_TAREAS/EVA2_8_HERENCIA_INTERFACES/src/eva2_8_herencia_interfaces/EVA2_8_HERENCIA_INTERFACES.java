/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_herencia_interfaces;

/**
 *
 * @author alox1
 */
public class EVA2_8_HERENCIA_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba prueba=new Prueba();
        prueba.metodoA();
        prueba.merodoB();
    }
    
}

class Prueba implements B{

    @Override
    public void merodoB() {
        
    }

    @Override
    public void metodoA() {
        
    }
    
}
//LAS INTERFACES SON ABSTRACTOS PORQUE NO TIENEN UN CUERPO
//SE PUEDEN CREAR CLASES ABSTRACTOS
//LOS METODOS ABSTRACTOS NO TIENEN CODIGO
interface A{
    public void metodoA();
}

interface B extends A{
    public void merodoB();
}