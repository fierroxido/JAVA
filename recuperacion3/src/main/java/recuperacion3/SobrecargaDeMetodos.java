/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion3;

import java.util.Random;

/**
 *
 * @author fierr
 */
public class SobrecargaDeMetodos {
      public static void main(String[] args) {
        String [] tituloArray = new String []{"Spiderman","Bolt","Barbie","Happinnes","Minions","Red film Z"};
        
        String titulo = play(tituloArray,3);
        String titulo2 = play(tituloArray);
        System.out.println("");
        pausa(titulo);
        System.out.println("");
        pausa(titulo2);
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("indice muy grande");
            return "";
        }
    }
    /*Sobrecarga de metodos
    Sirve para crear dos metodos con el mismo nombre y diferentes argumentos
    */
    
    public static String play(String[] tituloArray) {//La diferencia esta en que en este metodo play no tiene el index
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Rodando la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Pelicula no reproduce");
        }else{
            System.out.println("Pelicula pausada"+titulo);
        } 
    }
    
}

