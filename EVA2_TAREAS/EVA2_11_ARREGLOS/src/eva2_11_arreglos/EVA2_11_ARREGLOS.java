/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_arreglos;

/**
 *
 * @author alox1
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS
        //SON FILAS Y COLUMNAS PARA GUARDAR DATOS
        //SOLO DATOS DEL MISMO TIPO
        //SE ACCEDEN POR INDICES
        //PRIMER INDICE ES 0
        //ARREGLOS SON OBJETOS
        int[] arreglo=new int[10];//ARREGLO CON 10 ENTEROS
        arreglo[0]=100;
        System.out.println("El valor de arreglo en la posicion 0= "+arreglo[0]);
        arreglo[1]=200;
        arreglo[2]=200;
        arreglo[3]=200;
        arreglo[4]=200;
        arreglo[5]=200;
        arreglo[6]=200;
        arreglo[7]=200;
        arreglo[8]=200;
        arreglo[9]=200;
        arreglo[10]=200;
        arreglo[11]=200;
        String[] arreCade=new String[10];
        arreCade[5]="hola mundo";
        double[] arreDouble=new double[1000];
        arreDouble[999]=4651.51;
        Persona[] clasePOO=new Persona[32];
        
    }
    
}

class Persona{
    private String nombre;
    public Persona(){
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