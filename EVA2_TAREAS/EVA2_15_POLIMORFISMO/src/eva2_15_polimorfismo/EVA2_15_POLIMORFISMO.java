package eva2_15_polimorfismo;


public class EVA2_15_POLIMORFISMO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        persona persona = new persona("Juan", 30);
        Estudiante estudiante = new Estudiante ("21550339", 18, "Daniel");
        Docente docente = new Docente (036,"Pedro",50);
        
        persona personaEstu = estudiante;
        
        Estudiante estu1 = new Estudiante("Daniel", 19, "21550339");
 
        estu1.imprimirDatos();
        
        Docente mtro1 = new Docente();
        mtro1.imprimirDatos();
    }
}
class Docente extends persona{
    private int numeroRegistro;
    
    public Docente(){
        super();
        System.out.println("CLASE MAESTRO");
    }
    public Docente(int numeroRegistro, String Nombre, int Edad){
        super(Nombre, Edad);
        this.numeroRegistro = numeroRegistro;
    }
    public int getnumeroRegistro(){
        return numeroRegistro;
    }
    public void setnumeroRegistro(int numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }   
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de registro: " + numeroRegistro);
    }
}
class Estudiante extends persona {
    private String numeroControl;
    
    public Estudiante(){
        super();
        System.out.println("CLASE ESTUDIANTE");   
    }   
    public Estudiante(String Nombre, int Edad, String numeroControl){
        super(Nombre, Edad);
        this.numeroControl = numeroControl;     
    }
    public String getnumeroControl() {
        return numeroControl;
    }
    public void setnumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
 
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control: " + numeroControl);
        
    }
}
class persona {

    private String Nombre;
    private int Edad;

    public persona() {
        this.Nombre = "xxxxxx";
        this.Edad = 10000;
        System.out.println("CLASE PERSONA");

    }

     public String getNombre() {
        return Nombre;
    }

    public persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }

}