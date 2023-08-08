/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej2parte2;

/**
 *
 * @author aldio
 */
public class Guia1ej2parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuadrilatero ejemplo = new Cuadrilatero(2,4);
        
        System.out.println("El perimetro es "+ejemplo.calcularPerimetro());
        
        System.out.println("El area es "+ejemplo.calcularArea());
        
        System.out.println("Es un cuadrado? "+ ejemplo.esUnCuadrado());
        
    }
    
}
