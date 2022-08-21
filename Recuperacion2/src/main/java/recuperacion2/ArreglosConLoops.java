/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2;

/**
 *
 * @author fierr
 */
public class ArreglosConLoops {
    public static void main(String[] args) {
        int[] duracionEpisodio=new int[]{30,28,27,32,30};
        int n=duracionEpisodio.length;
        int temporadaDuracion=0;
        
        for (int i=0;i<n;i++){
            temporadaDuracion+=duracionEpisodio[i];//Se simplifica la operacion para indicar que el valor de temporadaDuracion sera sumada con la duracionEpisodio
        }
        System.out.println(temporadaDuracion);
            
    }
}
