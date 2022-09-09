/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias2;

import Herencias.movie;
import Herencias.series;

/**
 *
 * @author fierr
 */
public class HerenciaII {
    public static void main(String[] args) {
        
        movie Minions = new movie();
        Minions.setTitulo("Minions");
        Minions.setGenero("Dibujos animados");
        Minions.setPremioOscar(false);
        
        
        
        series StivenFuture = new series();
        StivenFuture.setTitulo("Stiven future");
        StivenFuture.setGenero("Animada");
        StivenFuture.setDuracionEpisodos(50);
        StivenFuture.setTotalEpisodios(20);
        StivenFuture.setTotalTemporadas(2);
        
        
        System.out.println(Minions.toString());
        System.out.println(StivenFuture.toString());
        
       Minions.play();
       Minions.pausa();
        
        StivenFuture.play();
        
        
        
    }
    
}
