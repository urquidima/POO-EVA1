/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_clase_computadora;

/**
 *
 * @author alox1
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora comp1=new Computadora();
        comp1.setCpu("Intel 9");
        comp1.setGrafica("RTX 3090");
        comp1.setMemRam(32);
        comp1.setAlmacenamiento(5000);
        comp1.setPrecio(60000);
        comp1.imprDatos();
    }
    
}
class Computadora{
    //ATRIBUTOS
    private String cpu, grafica;
    private double memRam, almacenamiento, precio;
    //COMPORTAMIENTO
    
    //METODOS CPU
    public void setCpu(String valor){
        cpu=valor;
    }
    public String getCpu(){
        return cpu;
    }
    //METODOS GRAFICA
    public void setGrafica(String valor){
        grafica=valor;
    }
    public String getGrafica(){
        return grafica;
    }
    //METODOS MEMRAM
    public void setMemRam(double valor){
        memRam=valor;
    }
    public double getMemRam(){
        return memRam;
    }
    //METODOS ALMACENAMIENTO
    public void setAlmacenamiento(double valor){
        almacenamiento=valor;
    }
    public double getAlmacenamiento(){
        return almacenamiento;
    }
    //METODOS PRECIO
    public void setPrecio(double valor){
        precio=valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void imprDatos(){
        System.out.println("CPU: "+cpu);
        System.out.println("GRAFICA: "+grafica);
        System.out.println("MEMORIA RAM (GB): "+memRam);
        System.out.println("ALMACENAMIENTO (GB): "+almacenamiento);
        System.out.println("PRECIO NETO: "+precio);
        System.out.println("PRECIO TOTAL: "+(precio*1.16));
    }
}
