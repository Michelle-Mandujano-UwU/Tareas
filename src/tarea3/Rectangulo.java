
package tarea3;


public class Rectangulo {
    int ancho,altura;

public Rectangulo(int ancho, int altura){
    this.ancho=ancho;
    this.altura=altura;
}
int area(){

return this.ancho*this.altura;
}
int perimetro(){

return this.ancho*2+this.altura*2;
}
String calcula(){
    String data=String.format("area: %d, perimetro: %d", this.area(), this.perimetro());
   return data;
           
}
}
