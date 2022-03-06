/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_memoria_2_stack;

/**
 *
 * @author alox1
 */
public class EVA1_8_MEMORIA_2_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
    
    public static void A(){//UTILIZAMOS STATIC PORQUE ESTA DENTRO DE CLASE STATIC
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
    }
    
    public static void B(){
        System.out.println("INICIA B");
        System.out.println("TERMINA B");
    }
    
}
