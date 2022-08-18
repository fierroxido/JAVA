/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Arreglos {
    
    public static void main(String[] args) {
        
        System.out.println("Digite el número de episodio que quiera saber su duración: ");
        
        Scanner entrada=new Scanner(System.in);//Se crea el Scanner normalmente
        int episodio=entrada.nextInt();
        
        int[] duracion =new int[5];//Sintaxis del arreglo, será de valor entero, el nombre de la variable es duración y el tamaño del arreglo es de 5
        
        duracion[0]=30;//Recordar que se utilizan las posiciones del arreglo y siempre se cuenta desde la posicion 0 
        duracion[1]=28;//Posicion 1 dato dos
        duracion[2]=24;//Posicion 2 dato tres
        duracion[3]=32;//Posicion 3 dato cuatro
        duracion[4]=31;//Posicion 4 dato cinco
        
        int duracionI=duracion[episodio];//Se crea la variable "duracionI" que es para imprimir los datos contenidos del array duracion y se toma el Scanner llamado episodio para aclarecer que es el dato que ingreso el usuario.
        System.out.println("El tiempo de duración del episodio ingresado es de: "+duracionI+" minutos");
        
        
        
        
        
        
    }
    
    
}
