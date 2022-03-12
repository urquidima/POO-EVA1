/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_constructores;

/**
 *
 * @author alox1
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona();
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        
        Persona persona2=new Persona("Alex", 18);
        System.out.println("Nombre 2: "+persona2.getNombre());
        System.out.println("Edad 2: "+persona2.getEdad());
        
        Persona persona3=new Persona(5.0);
        System.out.println("Nombre 3: "+persona3.getNombre());
        System.out.println("Edad 3: "+persona3.getEdad());
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    //CONSTRUCTOR
    //DEBE TENER EL MISMO NOMBRE DE LA CLASE
    //SI NO LO CREAMOS NOSOTROS, LO CREA JAVA AUTOMATICAMENTE
    //INICIALIZAR VALORES
    public Persona() {
        System.out.println("Objeto Persona creado");
        nombre ="Juan Perez";
        edad=100;
    }
    
    //SOBRECARGA DE MERODOS
    public Persona(String nombre, int edad){
        System.out.println("CREANDO OBJETO CON CONSTRUCTOR QUE ACEPTA VALORES");
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public Persona(double valor){
        System.out.println("CREANDO EL OBJETO QUE ACEPTA DOUBLE");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
