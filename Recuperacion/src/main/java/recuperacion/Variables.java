/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package recuperacion;

/**
 *
 * @author SENA
 */
public class Variables {

    public static void main(String[] args) {
        System.out.println("Hola mundo, ya soy programador JAVA!");
        
        
        //Variables en JAVA
        /*Puede haber varios tipos como lo son int,float,double,String,boolean,long,char.*/
       
        int edad=18;
        System.out.println("Mi edad es: "+edad);
        
        float altura=1.70f;//Si no se coloca la f al final es porque JAVA no sabe que el valor es de tipo flotante 
        System.out.println("Mi altura es: "+altura);
        
        double valorDePi=3.141592;
        System.out.println("El valor de PI es: "+valorDePi);
        
        long distanciaAlSol=5072021;//Si se pone más números al final colocamos la "l" siguiendo el ejemplo del float
        System.out.println("La distancia al sol es de: "+distanciaAlSol);
        
        boolean tomaCafe=false;
        System.out.println("¿Toma Café?"+tomaCafe);
        
        char miInicial='a';//Solo puede tener un caracter.
        System.out.println("Mi inicial es: "+miInicial+"\n");
        
        System.out.println("Trabajo con String:"+"\n");
        
        String saludo="Hola mundo, Soy Daniel Fierro\n";
        int longitud=saludo.length();//Buscamos la longitud de la String saludo
        System.out.println("La longitud del saludo es de: "+longitud+"\n");
        boolean stringVacio=saludo.isEmpty();//Un boolean si la variable saludo esta vacía 
        System.out.println("¿Esta vacío la String de saludo?"+stringVacio+"\n");
        char nuevoChar=saludo.charAt(2);//Se busca encontrar la posición del caracter en la posicion 2 de la cadena saludo 
        System.out.println("¿Qué dato esta en la posición 2? "+nuevoChar+"\n");
        boolean encontrar=saludo.contains("Daniel");
        System.out.println("¿La cadena contiene la palabra Daniel?"+encontrar+"\n");
        String subString=saludo.substring(1,8);//Mostrar los datos desde el indice 1 hasta el indice 8
        System.out.println(subString+"\n");
        String newString=saludo.replace("o","AA");//Se remplaza todas las "o por "AA"
        System.out.println(newString);
        
        System.out.println(String.format("Mi edad es %d",edad));/*el "%d" solo es para datos de tipo entero
        Se le dice al sistema que la variable edad es de tipo entero e imprime el dato normalmente, si se quiere agregar màs datos 
        con la misma forma de imprimir se hace así,sumando progresivamente el "%d":
          System.out.println(String.format("Mi edad es %d %d",edad,70));
        El %d puede ser utilizado tanto para int como para variables de tipo long y se puede juntar así:
        System.out.println(String.format("Mi edad es %d %d" ,edad,distanciaAlSol));
        
        */
        
        
        
        System.out.println(String.format("Mi altura es %f",altura));/*Se coloca el "%f" para definir que es un valor flotante el que 
        se está imprimiendo al lado de la String, se utiliza el %.Xf para los datos que quiero que aparezcan después del punto
        El %f puede ser utilizado tanto para flotantes como para variables de tipo double
         System.out.println(String.format("Mi altura es %.4f",altura));
        */
        
        
        
        
        
        
        
    }
}
