/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class Arreglos1 {
    
    public static void main(String[] args) {
        
        int x;  //Declaracion inicializador.
         
        int [] y = {7,-20,15};  //Arreglo de enteros, inicializacion explicita.
        
        int [] z = new int [4]; //Inicializacion implicita. tiene que aparecer el tamaño del arreglo
        
       String mensaje [] = {"Hola", "Como", "Estas", "Hoy"}; // Es una clase. Arrreglo referenciado de dos o mas primitivos.
        
        System.err.println(z[2]);
        
        //ciclo for para iterar los elementos de arreglo de String
        for(int i=0; i<mensaje.length; i++) {
            
             System.err.println(mensaje[i]);
           
        }//Termina ciclo for
        
        //Ciclo for mejorado
        for (String valor:mensaje) { //arreglo =mensaje tipo de valor String
           
            System.err.println(valor);
            
         //   if (valor.equals("Como")) break;  para detener el ciclo
            
        }// Termina ciclo for mejorado
        
            
        
    }
    
    
    
}
