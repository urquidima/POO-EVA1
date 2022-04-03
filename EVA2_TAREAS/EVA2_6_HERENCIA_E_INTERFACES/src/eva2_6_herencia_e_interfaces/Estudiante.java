/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author alox1
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String numControl;

    public Estudiante() {
        super();//CONSTRUCTOR DEFAULT DE PERSONA
        this.numControl="";
    }

    public Estudiante(String numControl, String nombre, int Edad) {
        super(nombre, Edad);//CONSTRUCTOR DE PERSONA
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Numero de control: "+numControl);
    }
    
}
