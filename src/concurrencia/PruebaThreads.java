/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class PruebaThreads implements Runnable { //NO HAY METODOS ANIDADOS EN JAVA
    
    public static void main(String[] args) { //threads son buenos por su arquitectura
        //Primer paso creado
        PrimerThread t1 = new PrimerThread();
        //Segundo paso creado
       
        
     
        Runnable r2 = new PrimerThread(); //polimorfismo
        Thread t2 = new Thread(r2);
        
        
        //tercer forma de crear trheads
        //usando clases internas anonimas(interface runnable)
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Yo soy un thread como clase interna anonima");
            }
            
        });
         t1.start();
         t2.start();
         t3.start();
}
    public void run () {
     
        System.out.println("Soy el segundo thread");
}
}

