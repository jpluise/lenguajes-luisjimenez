/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivaldo;

/**
 *
 * @author T-107
 */

import java.io.*; //usa cualquier clase de ese paquete.


public class InterfazDeUsuario {  //serializacion
    
    public static void main(String[] args) throws FileNotFoundException, IOException{ // (Exception)efectos negativos en lo servidores 
        
        //primero generamos el archivo a guardar
        File  file = new File ("sucio.xxx");
        
        //segundo INdicar si vamos a leer o guardar en ese archivo
        FileOutputStream fos= new FileOutputStream(file);  //iniciales, se va escribir algo, encadenamientop por construcor
        //ponemos algo en el archivaldo,guardar objetos serializados
        String mensajito ="Este es un mensaje basico";
        //Ahora si guardarmos este mensaje serializado
        ObjectOutputStream oos = new ObjectOutputStream(fos);//serializa el objeto
        //guardarmos
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensaje");
        
        
        
        
        
    }
    
    
}
