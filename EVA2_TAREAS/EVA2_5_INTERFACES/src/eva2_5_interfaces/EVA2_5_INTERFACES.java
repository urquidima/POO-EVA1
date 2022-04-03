/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_interfaces;

/**
 *
 * @author alox1
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers=new Persona();
        pers.setNombre("Alex");
        pers.setEdad(18);
        pers.imprimirDatos();
        //NO SE PUEDEN INSTANCIAR INTERFACES
        
        Vehiculos vehi=new Vehiculos("Ford","Mustang");
        vehi.imprimirDatos();
        vehi.mostrarMensaje();
    }
    
}

class Persona implements MuestraDatos{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
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
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}

class Vehiculos implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculos(){
        this.marca = "";
        this.modelo = "";
    }

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("hola mundo");
    }
    
}

interface MuestraDatos{
    //SOLO ACEPTAN METODOS PUBLICOS
    //SOLO DECLARACIONES DE METODOS--> SOLO ACEPTA METODOS ABSTRACTOS
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}