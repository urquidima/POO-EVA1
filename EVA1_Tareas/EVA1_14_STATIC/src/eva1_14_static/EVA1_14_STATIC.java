/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_static;

/**
 *
 * @author alox1
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR LA CLASE
        /*FormulasMatematicas misFor=new FormulasMatematicas();
        double area=misFor.calcularAreaCirculo(100);
        System.out.println("Area del circulo: "+area);*/
        double area=FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo: "+area);
        double areaT=FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area de triangulo: "+areaT);
        FormulasMatematicas miObj=new FormulasMatematicas();
        miObj.imprimirMensaje();
    }
    
}

class FormulasMatematicas{
    static int valor=100;
    //AREA CIRCULO:
    public static double calcularAreaCirculo(double radio){
        double area;
        area=3.1416*radio*radio;
        return area;
    }
    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area=(base*altura)/2;
        return area;
    }
    
    public void  imprimirMensaje(){
        System.out.println("Hola mundo");
    }
}
