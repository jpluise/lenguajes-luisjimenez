/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-107
 */
public class Imc {
    
    
    float peso; //Mi primer variable
    float altura; // Mi segundo variable
    
    public  Imc (float p, float a){ // Varibles locales.  Constructor
        
        peso = p;
        altura = a;
    }
    
    public Imc () { //Inicializar los atributos.
        
     peso = 78;
     altura = (float) 1.90;
        
    }
    
    public Imc (float f) {
        //ESTE CODIGO NO TYIENE NADA QUE VER CON LOS CONSTRUTORES
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //Reasignamos tipos no a los valores
        //Casting (promocion)
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
        
        
        
    }
    
    //Mi tecer variable
    public float calcular () { //Mi tipo de valor que me volvera, no lo ve el main.
        
        
        
        float resultadoImc = peso/(altura*altura);
        // Me regresa mi resultadoImc
        return resultadoImc;
        
       if ( resultadoImc < 20) {
       System.out.println("Estas demasiado flaxco");
        
        } else{
           
       if (resultadoImc = 25) {
      System.out.println("Estas sano");
           
       }else{
             
       if ( resultadoImc 25 > 30) {
       System.out.println("Fuera del rango");
               
       }else{
       
       if ( resultadoImc  > 30) {
       System.out.println("Estas con sobrepeso");
                
             }
              
           }
           
       }
       
           
           
       
        
        
    
    
 

