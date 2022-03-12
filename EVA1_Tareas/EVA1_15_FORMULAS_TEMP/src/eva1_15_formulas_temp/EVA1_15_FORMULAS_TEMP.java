/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author alox1
 */

//class formulasTemp
/*
c-f
c-k
f-c
f-k
k-c
k-f

Usar metodos estaticos
*/
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("""
                           Que formula quieres utilizar?
                           1.- Celsius a Fahrenheit 
                           2.- Celsius a Kelvin 
                           3.- Fahrenheit a Celsius 
                           4.- Fahrenheit a kelvin 
                           5.- Kelvin a Celsius 
                           6.- Kelvin a Fahrenheit""");
        byte form =leer.nextByte();
        
        System.out.println("Ingresa el valor a convertir:");
        double temp= leer.nextDouble();
        
        switch(form){
            case 1 -> FormulasTemp.cel_Fah(temp);
            case 2 -> FormulasTemp.cel_Kel(temp);
            case 3 -> FormulasTemp.fah_Cel(temp);
            case 4 -> FormulasTemp.fah_Kel(temp);
            case 5 -> FormulasTemp.kel_Cel(temp);
            case 6 -> FormulasTemp.kel_Fah(temp);
        }
        
    }
    
}

class FormulasTemp{
    
     public static void cel_Fah(double valor){
         System.out.println((valor*9/5) + 32);
     }
     
     public static void cel_Kel(double valor){
         System.out.println(valor+273.15);
     }
     
     public static void fah_Cel(double valor){
         System.out.println((valor-32)*5/9);
     }
     
     public static void fah_Kel(double valor){
         System.out.println((((valor-32)*5/9))+273.15);
     }
     
     public static void kel_Cel(double valor){
         System.out.println(valor-273.15);
     }
     
     public static void kel_Fah(double valor){
         System.out.println((((valor-273.15)*9/5))+32);
     }
     
}