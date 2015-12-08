/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import proyecto.grafica;

/**
 *
 * @author T-107
 */
public class Ventana extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

       grafica.plano.paintSQRFunc(grafica.plano.getGraphics(),-0.2,2,-15,-200,200);
    }

}