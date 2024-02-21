
package tarea3;


public class Tarea3 {

    
    public static void main(String[] args) {
        System.out.println("De la clase Persona");
        
        Persona personaUno = new Persona("Luis",20,"Masculino");
        Persona personaDos = new Persona("Diana",18,"Femenino");
        Persona personaTres = new Persona("Freddy",20,"Masculino");
        Persona personaCuatro = new Persona("Oliva",20,"Femenino");
        
        System.out.println(personaUno.Datos());
        System.out.println(personaDos.Datos());
        System.out.println(personaTres.Datos());
        System.out.println(personaCuatro.Datos());
        System.out.println();
        
        System.out.println("De la clase libro");
        
        Libro libroUno = new Libro();
        Libro libroDos = new Libro();
        Libro libroTres = new Libro();
        Libro libroCuatro = new Libro();
        
        libroUno.Titulo = "Bajo la misma estrella";
        libroUno.autor = "John Green";
        libroUno.añoPublicado = "2012";
        libroDos.Titulo = "La ladrona de libros";
        libroDos.autor = "Markus Zusak";
        libroDos.añoPublicado = "2005";
        libroTres.Titulo = "Amigo imaginario";
        libroTres.autor = "Sthepen Chbosky";
        libroTres.añoPublicado = "2019";
        libroCuatro.Titulo = "El libro que nadie debe leer";
        libroCuatro.autor = "Raquel Levinstein";
        libroCuatro.añoPublicado = "2020";
        
        System.out.println(libroUno.Titulo);
        System.out.println(libroUno.autor);
        System.out.println(libroUno.añoPublicado);
        System.out.println();
        System.out.println(libroDos.Titulo);
        System.out.println(libroDos.autor);
        System.out.println(libroDos.añoPublicado);
        System.out.println();
        System.out.println(libroTres.Titulo);
        System.out.println(libroTres.autor);
        System.out.println(libroTres.añoPublicado);
        System.out.println();
        System.out.println(libroCuatro.Titulo);
        System.out.println(libroCuatro.autor);
        System.out.println(libroCuatro.añoPublicado);
        
        System.out.println();
        System.out.println("De la clase rectangulo");
        Rectangulo rectanguloUno = new Rectangulo(18,12);
        Rectangulo rectanguloDos = new Rectangulo(15,7);
        Rectangulo rectanguloTres = new Rectangulo(10,5);
        Rectangulo rectanguloCuatro = new Rectangulo(8,4);
        System.out.println(rectanguloUno.calcula());
        System.out.println(rectanguloDos.calcula());
        System.out.println(rectanguloTres.calcula());
        System.out.println(rectanguloCuatro.calcula());
        
    }
    
}
