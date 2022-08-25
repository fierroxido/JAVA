/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videos24Al31;

import java.util.Random;

/**
 *
 * @author fierr
 */
public class Videos {
    public static void main(String[] args) {
    MoviesVideos Madmax=new MoviesVideos("Mad Max"," Accion",120);    
    MoviesVideos Toystory=new MoviesVideos("Toy Story"," Familiar",90);
    MoviesVideos StarWars=new MoviesVideos(" Star Wars"," Ciencia Ficcion",180);
    
        System.out.println(Toystory.getTitulo()+ " " + Toystory.getGenero()+" "+ Toystory.getDuracion() );
        System.out.println(StarWars.getTitulo()+ " " + StarWars.getGenero()+" "+ StarWars.getDuracion());
        
     
        public static String play(String[] tituloArray,int index){
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

  

    //Metodo sobrecargado
    public static String play(String[] tituloArray) {
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
    

