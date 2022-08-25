/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencias2;

/**
 *
 * @author fierr
 */
public class movie extends media {
    
    boolean premioOscar;
    
    public movie(String titulo,String genero, int duracion){
        super(titulo,genero,duracion);
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }
    
}
