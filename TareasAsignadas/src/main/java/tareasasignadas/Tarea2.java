/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasasignadas;
import java.util.Scanner;
/**
 *
 * @author fierr
 */
public class Tarea2 {
    public static void main(String[] args) {
    
        //Ejercicio #1
    System.out.println("Ingresa los mg para tu pocion multijugos: ");
    Scanner entrada=new Scanner(System.in);//Se crea el Scanner normalmente
       int mg=entrada.nextInt();   
       
       if(mg>100){
           System.out.println("¡Felicidades, es una buena poción!");
       }
       else{
           System.out.println("La poción es mediocre, sangre sucia inmunda");
       }
       System.out.println("------------------------------------------------------------------------------------ \n---------------------------------------------------------------------------------------");
        //Ejercicio #2
        
        
        
        System.out.println("Ingrese la distancia del conductor");
        Scanner distancia=new Scanner(System.in);
        double km=distancia.nextDouble();
                
        System.out.println("Digite True si el uber esta disponible, en caso contrario digite False \nGracias!");
         Scanner disponibilidad=new Scanner(System.in);
         boolean validacion=disponibilidad.hasNextBoolean();
         
         if(km<=0.5 && validacion==true){
             System.out.println("Listos para iniciar el recorrido");
             }
         else if(km<=0.5 && !validacion){
             System.out.println("Conductor cercano pero no disponible");
         }
         else if(km>0.5 && validacion==true){
             System.out.println("Conductor lejos,y disponible ¡Se aplicaran tarifas altas!");
         }
         else{
             System.out.println("Busque otro viaje, conductor lejos y no tiene cupo!");
         }
        //Ejercicio #3
        
        System.out.println("------------------------------------------------------------------------------------ \n---------------------------------------------------------------------------------------");
        System.out.println("Inserta un numero entero");
        
    Scanner suma=new Scanner(System.in);//Se crea el Scanner normalmente
    int n=suma.nextInt();
    int total=0;
    
    for(int i=0;i<n;i++){
        total=n+i;
    }
        System.out.println(String.format("La suma del número ingresado corresponde a %d",total));
    
    
        
System.out.println("------------------------------------------------------------------------------------ \n---------------------------------------------------------------------------------------");        

System.out.println("Diga en que día se encuentra: ");
        Scanner dia= new Scanner(System.in);//El Scanner es una forma de pedir datos al usuario , recordar que para valores que sean String es solamente
        int dias=dia.nextInt();

        System.out.println("Digite el clima que ve el día de hoy");
switch (dias){
            case 1:
                System.out.println("El clima es de tormentas");
                break;
        
       
            case 2:
                System.out.println("El clima es soleado");
                break;
        
        
            case 3:
                System.out.println("El clima es lluvioso");
                break;
        
        
            case 4:
                System.out.println("El clima es soleado");
                break;
        
       
            case 5:
                System.out.println("El clima es nevado");
                break;
        
       
         default:
         System.out.println("Preguntale a google");
         
        }
System.out.println("------------------------------------------------------------------------------------ \n---------------------------------------------------------------------------------------");        

        String[] titleArray=new String[]{"Ted","Barbie","Max Steel","Batman","Avatar","Son como niños"};
    
        int maxLength=0;
        String longestTitle="";
        
        for(String title:titleArray){
            int titleLength=title.length();
            if(titleLength>maxlength){
                maxlength=titleLength;
                longestTitle=title;      
    
            }
            
           
        }
        System.out.println(longestTitle);








    }
    
    }

