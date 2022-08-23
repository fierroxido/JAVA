/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion3;

/**
 *
 * @author fierr
 */
public class Metodos {
    public static void main(String[] args) {
        String[] titulos=new String []{"Spiderman","Bolt","Barbie","Happinnes","Minions","Red film Z"};
        
        //Si queremos ver cuales son las variables necesarias en un metodo se oprime control+p para ver lo que se requiere
        play(titulos,1);//Se indica que vamos a utilizar los valores del arreglo titulos utilizando el indice 1, recordar las posiciones desde 0
        System.out.println("");
        pause();
    }
    public static void play(String[] titulos,int index) {//String[] titulos,int index--Argumentos
        
        if(index<titulos.length){
           String title=titulos[index];
            for(int i=0;i<10;i++){
                System.out.println("Reproduciendo pelicula..."+title);
            }    
        
        }else{
            System.out.println("Digite otro número por favor...");
        }        
    }
    public static void pause() {
        System.out.println("¡La pelicula esta pausada!");
        
    }
    
    /*Arreglos con return
    Recordar que con la palabra reservada Void significa vacío y jamas regresa nada
    
    public class Metodos {
    public static void main(String[] args) {
        String[] titulos=new String []{"Spiderman","Bolt","Barbie","Happinnes","Minions","Red film Z"};
        
        
        String title=play(titulos,1);Al tener el metodo play como String entonces podemos crear una variable 
                                Cuando se ejecute el metodo play nos va a regresar title o nos regresará un valor vacio si da error en el else
        System.out.println("");
        pause();
    }
    Primer cambio/public static String play(String[] titulos,int index) {//String[] titulos,int index--Argumentos
        
        if(index<titulos.length){
           String title=titulos[index];
            for(int i=0;i<10;i++){
                System.out.println("Reproduciendo pelicula..."+title);
            }    
        return title;
        }else{
            System.out.println("Digite otro número por favor...");
        return "";
        }        
    }
    public static void pause() {
    if(title.isEmpty()){
        System.out.println("Ninguna pelicula reproduciendo!");
        }else{
        System.out.println("La pelicula esta pausada"+title);
        }
    }
    
    
    */
    
}
