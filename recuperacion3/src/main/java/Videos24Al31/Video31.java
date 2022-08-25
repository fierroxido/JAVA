/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videos24Al31;

/**
 *
 * @author fierr
 */
public class Video31 {
    public static void main(String[] args) {
        
        MoviesVideos Madmax=new MoviesVideos("Mad Max"," Accion",120);    
        MoviesVideos Toystory=new MoviesVideos("Toy Story"," Familiar",90);
        MoviesVideos StarWars=new MoviesVideos(" Star Wars"," Ciencia Ficcion",180);
    
        int totalFrames=MoviesVideos.FRAME_RESOLUTION;
        System.out.println(totalFrames);
        
      
    }
}
