/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videos24Al31;

/**
 *
 * @author fierr
 */
public class MoviesVideos {
    
    static final int FRAME_RESOLUTION=60;
    static final int SECONDS_IN_A_MINUTE=60;
    
    String titulo;
    String genero;
    int duracion;

    public MoviesVideos(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public static int getTotalFrames(int duration){
        return duration*SECONDS_IN_A_MINUTE*FRAME_RESOLUTION;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}


