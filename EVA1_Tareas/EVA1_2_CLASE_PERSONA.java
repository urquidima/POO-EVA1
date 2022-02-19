public class EVA1_2_CLASE_PERSONA {
  public static void main(String[] args)// DECLARACION
  {
    // IMPLEMENTACION
    System.out.println("HOLA");
    // COMO CREAR UN OBJETO EN JAVA
    // INSTANCIACION:CREAR UN OBJETO//DAR MEMORIA JAVA--> new|| c++ --> new, malloc
    // DECLARAR
    // CONSTRUIR
    Persona estudiante = new Persona();// DECLARO UN IDENTIFICADOR (OBJETO)TIPO DE PERSONA
    estudiante.id="001";
    estudiante.nombre = "Alex";
    estudiante.edad=18;
    System.out.println(estudiante.nombre);
    Persona estudiante2= new Persona();
    estudiante2.nombre="Ruben";
    estudiante2.id="002";
    estudiante2.edad=40;
    System.out.println(estudiante2.nombre);
    estudiante.imprimirDatos();
    //CONCATENACION-> PEGAR CADENAS DE TEXTO
    // "   "+ ENTERO/BOLEANO/STRING/DOUBLE/ETC -->CADENA DE TEXTO
    System.out.println("Año de nacimiento: "+ estudiante.calculaAñoNacimiento());
  }
}

class Persona// DECLARACION
{
  // IMPLEMENTACION
  String id;
  String nombre;
  int edad;
  // COMPORTAMIENTO
  // METODO IMPRIMIR DATOS --> METODO/FUNCION --> F(X)= -X+1
  // VALOR DE RETORNO + NOMBRE DE LA FUNCION (ARGUMENTOS);
  void imprimirDatos(){
    //no regresa valor por el void, el nombre es imprimir datos (no recibe valores)
    System.out.println("El nombre es: "+nombre);
    System.out.println("El id es: "+id);
    System.out.println("Su edad  es: "+edad);
  }
  //CALCULAR AÑO DE NACIMIENTO
  int calculaAñoNacimiento(){
    int añoNac=2022-edad;
    return añoNac;
  }
}