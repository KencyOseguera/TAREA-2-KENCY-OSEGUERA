/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2;

import java.util.Scanner;

/**
 *
 * @author kency
 */
public class TAREA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenido(a). Esta es una calculadora");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Ingrese los datos separados por un espacio: ");
        
        Scanner entrada = new Scanner(System.in);
        
        //Valores separados 
        String cadena = entrada.next();
        String operador = entrada.next();
        String cadena2 = entrada.next();
        
        //Conversion de string a primitivo: parseo
        int x = Integer.parseInt(cadena);
        int y = Integer.parseInt(cadena2);
        
        System.out.println("El resultado de la operacion es: ");
        
        switch (operador){
            
            case "+":
                System.out.println(+(x+y));
                break;
            case "-":
                System.out.println(+(x-y));
                break;
            case "*":
                System.out.println(+(x*y));
                break;
            case "/":
                System.out.println(+(x/y));
            case "^":
                System.out.println(Math.pow(x, y));
                break;
            default:
              System.out.println("No se puede realizar la operacion");  
        
        }
  
        entrada.close();
        
    }
    
}
