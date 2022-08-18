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
public class Switch {
    public static void main(String[] args) {
        
        
        //El switch tiene una funcion similar a la de un if, siendo esta una forma más sencilla y ordenada de utilizarla.
        System.out.println("Diga en que día se encuentra: ");
        Scanner entrada= new Scanner(System.in);//El Scanner es una forma de pedir datos al usuario , recordar que para valores que sean String es solamente
        int dia=entrada.nextInt();//Recordar que para valores que sean String es solamente con el .next();
        
        
        switch (dia){
            case 1:
                System.out.println("Es día de deporte");
                break;
        
       
            case 2:
                System.out.println("Es día de ocio");
                break;
        
        
            case 3:
                System.out.println("Es día de cine");
                break;
        
        
            case 4:
                System.out.println("Es día de terror");
                break;
        
       
            case 5:
                System.out.println("Es día de thriller");
                break;
        
        
            case 6:
                System.out.println("Es día de comedia");
                break;
        
        
            case 7:
                System.out.println("Es día de dormir");
                break;
        
         default:
         System.out.println("¿En qué día vives?");
        }
    }
    
}
