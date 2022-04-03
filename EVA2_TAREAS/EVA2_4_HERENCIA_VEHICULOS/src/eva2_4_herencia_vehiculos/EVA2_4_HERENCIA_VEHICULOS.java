/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia_vehiculos;

/**
 *
 * @author alox1
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Camiones extends Vehiculos{
    String capCarga;
    int numTrailas;
    String tipoCamion;

    public Camiones() {
        super();
        capCarga="";
        numTrailas=0;
        tipoCamion="";
    }

    public Camiones(String capCarga, int numTrailas, String tipoCamion, String tipoCombustible, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numLlantas, litMotor, numCilindros, pasajeros, marca, modelo, año);
        this.capCarga = capCarga;
        this.numTrailas = numTrailas;
        this.tipoCamion = tipoCamion;
    }
    
    @Override
    public void imprDatos(){
        super.imprDatos();
        System.out.println("Capacidad de carga: "+capCarga);
        System.out.println("Numero de trailas: "+numTrailas);
        System.out.println("Tipo de camion: "+tipoCamion);
    }
    
}

class Camioneta extends Vehiculos{
    String cajuela;
    String tipoCamioneta;
    String puertas;

    public Camioneta() {
        super();
        cajuela="";
        tipoCamioneta="";
        puertas="";
    }

    public Camioneta(String cajuela, String tipoCamioneta, String puertas, String tipoCombustible, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numLlantas, litMotor, numCilindros, pasajeros, marca, modelo, año);
        this.cajuela = cajuela;
        this.tipoCamioneta = tipoCamioneta;
        this.puertas = puertas;
    }
    
    public void imprDatos(){
        super.imprDatos();
        System.out.println("Cajuela: "+cajuela);
        System.out.println("Tipo de camioneta: "+tipoCamioneta);
        System.out.println("Puertas: "+puertas);
    }
    
}

class Motocicletas extends Vehiculos{

    String tipoMoto;
    String cajon;
    String casco;
    
    public Motocicletas() {
        super();
        tipoMoto="";
        cajon="";
        casco="";
    }

    public Motocicletas(String tipoMoto, String cajon, String casco, String tipoCombustible, int numLlantas, int litMotor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        super(tipoCombustible, numLlantas, litMotor, cilindros, pasajeros, marca, modelo, año);
        this.tipoMoto = tipoMoto;
        this.cajon = cajon;
        this.casco = casco;
    }
    
    @Override
    public void imprDatos(){
        super.imprDatos();
        System.out.println("Tipo de moto: ");
        System.out.println("Cuenta con una caja: ");
        System.out.println("Cuenta con un casco: ");
    }
    
}

class Vehiculos{
    
    String tipoCombustible;
    int numLlantas;
    int litMotor;
    int numCilindros;
    int pasajeros;
    String marca;
    String modelo;
    int año;

    public Vehiculos() {
        this.tipoCombustible = "";
        this.numLlantas = 0;
        this.litMotor = 0;
        this.numCilindros = 0;
        this.pasajeros = 0;
        this.marca = "";
        this.modelo = "";
        this.año = 0;
    }

    public Vehiculos(String tipoCombustible, int numLlantas, int litMotor, int numCilindros, int pasajeros, String marca, String modelo, int año) {
        this.tipoCombustible = tipoCombustible;
        this.numLlantas = numLlantas;
        this.litMotor = litMotor;
        this.numCilindros = numCilindros;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public void imprDatos(){
        System.out.println("Tipo de combustible: "+tipoCombustible);
        System.out.println("Numero de Llantas: "+numLlantas);
        System.out.println("Litros del motor: "+litMotor);
        System.out.println("Numero de cilindros: "+numCilindros);
        System.out.println("Numero de pasajeros: "+pasajeros);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
    
}