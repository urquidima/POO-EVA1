/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_clase_auto;

/**
 *
 * @author alox1
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1=new Automovil();
        auto1.setMarca("Ford");
        auto1.setModelo("Mustang");
        auto1.setTipo("Sedan");
        auto1.setAño(2022);
        auto1.setColor("Rojo");
        auto1.setPrecio(1167000.00);
        System.out.println("Marca: "+auto1.getMarca());//CONCATENACION, SOBRE CARGA DE OPERADORES
        System.out.println("Modelo: "+auto1.getModelo());//SE REFIERE A DARLE OTRA FUNCION AL "+"
        System.out.println("Tipo: "+auto1.getTipo());
        System.out.println("Año: "+auto1.getAño());
        System.out.println("Color: "+auto1.getColor());
        System.out.println("Precio: "+auto1.getPrecio());
    }
    
}

class Automovil{//TIPOS DE DATOS ABSTRACTOS
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    //COMPORTAMIENTO
    
    //METODOS SET/GET
    //METODOS MARCA
    public void setMarca(String valor){
        marca=valor;
    }
    public String getMarca(){
        return marca;
    }
    //METODOS MODELO
    public void setModelo(String valor){
        modelo=valor;
    }
    public String getModelo(){
        return modelo;
    }
    //METODOS TIPO
    public void setTipo(String valor){
        tipo=valor;
    }
    public String getTipo(){
        return tipo;
    }
    //METODOS AÑO
    public void setAño(int valor){
        año=valor;
    }
    public int getAño(){
        return año;
    }
    //METODOS COLOR
    public void setColor(String valor){
        color=valor;
    }
    public String getColor(){
        return color;
    }
    //METODOS PRECIO
    public void setPrecio(double valor){
        precio=valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void impriDatAuto(){
        System.out.println("Datos del vehiculo: ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Tipo: "+tipo);
        System.out.println("Año: "+año);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
    }
}
