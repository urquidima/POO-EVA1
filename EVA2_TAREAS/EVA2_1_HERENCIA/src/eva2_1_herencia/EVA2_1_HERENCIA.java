/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_herencia;

/**
 *
 * @author alox1
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estudiante estu1=new Estudiante("JUANA",22,"2165442316");
        /*estu1.setNombre("Alex");
        estu1.setEdad(18);
        estu1.setNumeroControl("21550305");
        estu1.mostrarNombre();
        estu1.imprimirDatos();*/
        //estu1.imprimirDatos();
        
        Maestro mtro=new Maestro();
        mtro.imprimirDatos();
    }
    
}

//EXTENDS--> IS A -->MAESTRO ES-UNA PERSONA
class Maestro extends Persona{
        //NO_DE_REGISTRO ENTERO
        private int numRegistro;
        
        public Maestro(){
            super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
            System.out.println("CLASE MAESTRO");
        }
    
        public Maestro(String nombre, int edad, int numRegistro) {
            super(nombre, edad);//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
            this.numRegistro=numRegistro;
        }

        public int getNumRegistro() {
            return numRegistro;
        }

        public void setNumRegistro(int numRegistro) {
            this.numRegistro = numRegistro;
        }
        
        @Override
        public void imprimirDatos(){
            super.imprimirDatos();
            System.out.println("No de registro: "+numRegistro);
        }
        
    }

//EXTENDS--> IS A -->ESTUDIANTE ES-UNA PERSONA
class Estudiante extends Persona{ //SUBCLASE (HIJO)
    private String numeroControl;
    
    //CONSTRUCTOR DEFAULT
    public Estudiante(){
        super();//LLANADA AL CONSTRUCTOR DE LA SUPERCLASE
        System.out.println("CLASE ESTUDIANTE");
    }
    
    public Estudiante(String nombre, int edad, String numeroControl) {
        super(nombre, edad);//LLANADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.numeroControl=numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
    public void mostrarNombre(){
        System.out.println("Nombre del estudiante: "+ getNombre());
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control: "+numeroControl);
    }
    
}

class Persona{ //SUPERCLASE (PADRE)
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "AAAAAAAAAAA";
        this.edad = 165434;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}