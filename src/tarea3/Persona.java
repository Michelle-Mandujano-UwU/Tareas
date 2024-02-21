
package tarea3;


public class Persona {
    String nombre= "juan";
    int edad=20;
    String genero = "Masculino";
   
public Persona (String nombre, int edad, String Genero){
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
}
String Datos(){
        return String.format("nombre: %s edad: %d genero: %s", nombre,edad,genero);
        
    }
}
