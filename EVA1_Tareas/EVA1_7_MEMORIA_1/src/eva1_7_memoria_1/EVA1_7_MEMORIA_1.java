/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_memoria_1;

/**
 *
 * @author alox1
 */
public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor=5; //4 bytes
        String cade="hola";
        Prueba obj=new Prueba();
        System.out.println("Valor= "+valor);
        System.out.println("Cadena= "+cade);
        System.out.println("Ojbjeto= "+obj);
    }
    
}

class Prueba{
    public void Saludar(){
        System.out.println("hola mundo");
    }
}