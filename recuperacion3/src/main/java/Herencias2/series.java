/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias2;

import java.util.Scanner;

/**
 *
 * @author fierr
 */

    public class series extends media {
    
    int totalEpisodios;
    int totalTemporadas;
    int duracionEpisodos;
    
    public series(String titulo,String genero, int duracion,int totalEpisodios,int totalTemporadas){
        super(titulo,genero,duracion);
        this.totalEpisodios = totalEpisodios;
        this.totalTemporadas = totalTemporadas;   
    }
    
    public series(){
        super ("","",0);
        totalEpisodios = 0;
        totalTemporadas = 0;
        duracionEpisodos = 0;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public int getDuracionEpisodos() {
        return duracionEpisodos;
    }

    public void setDuracionEpisodos(int duracionEpisodos) {
        this.duracionEpisodos = duracionEpisodos;
    }
    
    public void moveForward(){
        System.out.println("¿Cuantos minutos deseas adelantar?");
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        super.moveForward(minutos);
    }
}


