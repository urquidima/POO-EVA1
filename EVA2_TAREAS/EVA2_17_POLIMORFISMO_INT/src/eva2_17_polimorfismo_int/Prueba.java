/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_polimorfismo_int;

/**
 *
 * @author alox1
 */
public class Prueba implements Mensajes {

    public void mostrarMensaje(String mensaje) {
       System.out.println(mensaje);
    }

    @Override
    public void MostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void otroMetodo (){
      System.out.println("metodo adicional");
    }
    
}

