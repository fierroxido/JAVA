/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2;

/**
 *
 * @author fierr
 */
public class arreglosDeStrings {
    public static void main(String[] args) {
        String[] titulos=new String []{"Spiderman","Bolt","Barbie","Happinnes","Minions","Red film Z"};
    
        for(String title:titulos){//Se utiliza para iterar sobre la variable titulos, es decir evitar todo el codigo que se plantea en el for usualmente
            if(!title.contains("i")){//Se refiere a si en el arreglo de titulo existe la letra "i" entonces imprimir los datos diferentes a este, solo datos que no tengan la i
                System.out.println(title);
            }
            
        }
    }
}
