/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_mod_acceso;

/**
 *
 * @author alox1
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1= new Persona();//INSTANCIAR (CREAR UN OBJETO)
        per1.setId("21550305");
        per1.setNombre("Alex");
        per1.setEdad(18);
        System.out.println("Nombre: "+per1.getNombre());
        System.out.println("Id: "+per1.getId());
        System.out.println("Edad: "+per1.getEdad());
        
        Persona per2=new Persona();
        per2.setId("21550308");
        per2.setNombre("Ruben");
        per2.setEdad(40);
        System.out.println(per2.getNombre()+per2.getId());
    }
    
}

class Persona{
    //ATRIBUTOS (VARIABLES)- propiedades
    private String id;
    private String nombre;
    private int edad;
    //COMPORTAMIENTO (METODOS)
    //PARA LEER Y MODIFICAR LOS ATRIBUTOS, USAMOS METODOS DE LECTURA/ESCRITURA
    
    //LEER--GET
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    //ASGINAR VALORES-->SET
    public void setId(String valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
}
