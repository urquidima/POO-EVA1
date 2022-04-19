/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author alox1
 */
public class EVA2_13_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloPer=new Persona[10];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            //CREAR EL OBJETO
            arregloPer[i]=new Persona();
            System.out.println("Cual es tu  nombre?");
            arregloPer[i].setNombre(input.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: "+arregloPer[i].getNombre());
        }
    }
    
}

class Persona{
    
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}