/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tareasasignadas;

import static java.lang.Math.pow;

/**
 *
 * @author fierr
 */
public class tarea1 {

    public static void main(String[] args) {
        
        //Ejercicio #1
    int largo = 15;
    int ancho = 23;
    int alto = 12;
    int volumen = largo * ancho * alto;
    
        System.out.println("El volumen de su cubo rectangular es: "+volumen);
        
        System.out.println("---------------------------------------------");
        
    int masa = 12;
    int velocidad = 3;
    double ec = (masa * pow(velocidad, 2))/2.0;
    //Se sigue la formula de la energía cinetica y se busca 
    
        System.out.println("La energia cinetica de la operacion es : " +ec+""+(double)Math.round(ec));//Se utiliza este metodo para imprimir la operación y multiplicar el flotante a dos decimales
    /*
        Las variables mencionadas son de tipo:
    a. char
    b. long
    c. float o double
    d. boolean
    e. int
    f. String
    g. double
        */
    
    double subtotal = (60 * 0.30) + (100 * 0.25) + (20 * 80);
    double iva = subtotal * 0.16;
    double total = subtotal + iva;
        System.out.println(String.format("El total a pagar es: $%.2f", total));
        
        
    }
}
