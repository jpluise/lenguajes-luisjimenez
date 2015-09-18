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
    
    
    public Imc (){ //Inicializar los atributos.
        
     peso = 78;
     altura = (float) 1.90;
        
    }
    
    //Mi tecer variable
    public float calcular () { //Mi tipo de valor que me volvera, no lo ve el main.
        
        float resultadoImc = peso/(altura*altura);
        // Me regresa mi resultadoImc
        return resultadoImc;
        
    }
    
 
}
