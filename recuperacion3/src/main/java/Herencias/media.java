/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias;

/**
 *
 * @author fierr
 */
public class media {
    String titulo;
    String genero;
    int duracion;

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void play(){
        System.out.println("Reproducir "+titulo);
    }
    public void pausa(){
        System.out.println("Pausar "+titulo);
    }

    @Override//Recordar que el override es para indicar que hay un metodo que se repite y es para confirmar al programador que esta digitando correctamente 
    public String toString() {
        return "media titulo es " + titulo + ", genero " + genero + ", duracion " + duracion;
    }
    
}
