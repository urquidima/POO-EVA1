/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_13_access_modifiers;

/**
 *
 * @author alox1
 */
public class Automovil {
    private String modelo, marca;
    private int año;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    void imprimirMensaje(){ //metodo con modificador default
        System.out.println("Hola mundo!!!");
    }
    
}

class Carreta{ //MODIFICADOR DE ACCESO-->DEFAULT
    private String marcas;

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }
    
}
