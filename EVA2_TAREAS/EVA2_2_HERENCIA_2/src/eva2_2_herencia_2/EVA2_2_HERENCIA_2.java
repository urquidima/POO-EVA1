/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_herencia_2;

/**
 *
 * @author alox1
 */
//IS A -->ES UN
//HAS A --> TIENE UN

public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dire =new Direccion("5ta",100,"X","0011","Chihuahua","Chihuahua","002112222");
        Estudiantes estu1=new Estudiantes("41685325","Alex",18,dire);
        estu1.imprimirDatos();
    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }
    
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimirDireccion(){
        System.out.println("Calle: "+calle+", Numero: "+numero+
                ", Colonia: "+colonia+", CP: "+cp+", Ciudad: "+ciudad+
                ", Estado: "+estado);
    }
    
}

//ESTUDIANTE IS-A --> ESTUDIANTE ES UNA PERSONA
class Estudiantes extends Persona{
    private String numeroControl;
    //ESTO ES UN OBJETO SIN INSTANCIAR
    //LO VAMOS A INSTANCIAR EN EL CONSTRUCTOR
    private Direccion direccion; //HAS A -->ESTUDIANTE TIENE UNA DIRECCION
    
    public Estudiantes(){//INICIALIZAR
        super();
        this.numeroControl="";
        //INSTANCIAR DIRECCION
        direccion=new Direccion();
    }

    public Estudiantes(String numeroControl, String nombre, int edad, Direccion direccion) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
        this.direccion=direccion;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de control:"+numeroControl);
        direccion.imprimirDireccion();
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() { //CONSTRUCTOR DEFAULT
        this.nombre="";
        this.edad=0;
    }
    
    public Persona(String nombre, int edad) { //CONSTRUCTOR CON ARGUMENTOS
        this.nombre=nombre;
        this.edad=edad;
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
    
    void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
