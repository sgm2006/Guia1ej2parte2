/*

2) En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un
constructor que permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes
métodos adicionales:
 calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
 calcularArea(): este método retornará la superficie del cuadrilátero.
 esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso
contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrar por consola su superficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiar el estado de uno de sus atributos para que sea un cuadrado.
 */
package guia1ej2parte2;

/**
 *
 * @author aldio
 */
public class Cuadrilatero {
    
    private int largo;
    private int alto;

    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int calcularPerimetro(){
        
        return (this.largo * 2 )+( this.alto * 2);
                
    }
    public int calcularArea(){
        
        return this.largo * this.alto;
        
        }
    public boolean esUnCuadrado(){
        return this.alto == this.largo;
    }
    
}
