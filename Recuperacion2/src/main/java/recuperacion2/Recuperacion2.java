/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package recuperacion2;

/**
 *
 * @author SENA
 */
public class Recuperacion2 {

    public static void main(String[] args) {
        
        //Netflix
        int numEpisodios=2;//Cuando la variable esta establecida y no puede cambiarse se dice que esta "Hard-codeado", en este caso es el "1" el que lo está
        int temporadas=3;
        
        //Operador or= ||, si no se cumple una función pero si se cumple la otra entonces cumple el if
        //Se crea un condicional padre el cual define si es mayor a un episodio o  pasa al siguiente ciclo que consta de si es menor o igual a 10 episodios es una miniserie, sino es una serie
        
        if (numEpisodios>1 || temporadas>1 ){
            System.out.println("Es una miniserie");
        } else if(numEpisodios>10){
            System.out.println("Es una serie");
        } else if(numEpisodios==1){
            System.out.println("Es una pelicula");
        } else{
            System.out.println("Debe tener al menos un episodio");
        }
        
        System.out.println("/////////////////-------------------////////////////-----------------------------///////////////////");
        //Ciclo while
        int i=0;
        int tiempo=10;
        
        while(i<=tiempo){//Si no se cumple la condición nunca va a entrar al ciclo
             if(i<1){
                System.out.println("Reproduciendo intro abc, segundo "+i);     
            }
             else if(i<7){
                 System.out.println("Reproduciendo pelicula, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo creditos, segundo "+i);
             }
            i=i+1; //Recordar que hay un atajo con es con i++ que realiza la misma función que al escribir la forma larga
                    //Se incrementa la variable i para que el ciclo cumpla en algún momento el ciclo.
        }
       
        System.out.println("/////////////////-------------------////////////////-----------------------------///////////////////");
         for(int j=0;j<tiempo;j++){//Se crea la variable j y se dice que mientras j sea menor que la duracion de la pelicula "tiempo", y se establece como cambiara la variable que está al principio en este caso aumentará o se sumará uno
            if(j<1){
                System.out.println("Reproduciendo intro def, segundo "+i);     
            }
             else if(j<7){
                 System.out.println("Reproduciendo pelicula, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo creditos, segundo "+i);
             }
        }
       System.out.println("/////////////////-------------------////////////////-----------------------------///////////////////");
            
       int k=0;
       
       do{//Entra al menos una vez en el ciclo porque la condicion se evalua hasta el final
           if(k<3){
                System.out.println("Reproduciendo intro ghi, segundo "+i);     
            }
             else if(k<7){
                 System.out.println("Reproduciendo pelicula, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo creditos, segundo "+i);
             }
           k++;//Recordar aumentar la variable para que el ciclo no se vuelva infinito
       }while(k<=tiempo);//final 
       
       
       
       
       
       
       
       
       
       
    }
}
