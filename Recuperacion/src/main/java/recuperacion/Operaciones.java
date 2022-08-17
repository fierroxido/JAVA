/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion;

/**
 *
 * @author SENA
 */
public class Operaciones {
    public static void main(String[] args) {
        //Rectangulo
        int a=18;
        int b=19;
        //Area
        int rArea=a*b;
        System.out.println("El area del rectangulo es : "+rArea);
        
        //Perimetro 
        int rPeri=(2*b)+(2*a);
        System.out.println("El perimetro del rectangulo es: "+rPeri);
        
        //Triangulo 
        
       b=5;
       a=3;
       
       double tArea=b*a/2;
        System.out.println(String.format("El area del rectangulo es: %.2f",tArea));
        
        //Hipotenusa
        //Raiz cuadrada de la   suma de los catetos
        
        double sumaCatetos=Math.pow(a,2)+Math.pow(b, 2);
        double area=Math.sqrt(sumaCatetos);//La función sqrt sirve para sacar la raíz cuadrada, en este caso de "sumaCatetos"
        System.out.println(area);
        /*
        La función Math sirve para muchas cosas, recordar que también hay otras funciones como lo son "abs" que es absoluto el cual pasa un número negativo a positivo y si es positivo 
        queda tal como esta.
        También esta "ceil" que nos redondea al número más cercano o al número entero más cercano
        También esta "round" que redondea un numero al más cercano
        Entre muchas otras
        */
        
        
        
        //Circulo
        int r=60;
        double pi=3.1416;
        double cArea=pi*Math.pow(r,2);//El pow se utiliza para elevar un número a cierta potencia en este caso es el radio el número el cual se eleva
        System.out.println("El area del ciruculo es:"+cArea);
        
        
        
        
        
    }
}
