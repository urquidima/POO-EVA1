/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_memoria_heap;

/**
 *
 * @author alox1
 */
public class EVA1_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=5;
        Prueba obj1=new Prueba();
        Prueba obj2=new Prueba();
        //REFERENCIAS---> ES UNA DIRECCION DE MEMORIA (OBJ1)
        //APUNTADORES---> DIRECCIONES DE MEMORIA RAM
        //JAVA SOLO MANEJA REFERENCIAS
        //GARBAGE COLLECTOR DESTRUYE OBJETOS
        System.out.println(obj1);
        System.out.println(obj1.valor);
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2=null;//SE ELIMINA LA REFERENCIA
        //CUANDO NO ELEMINAS OBJETOS Y NO SE UTILIZAN EN EL PROGRAMA
        ///SE LE LLAMA FUGA DE MEMORIA (MEMORY LEAK)
        System.out.println(obj2.valor);
    }
    
}

class Prueba{
    int valor=100;
}
