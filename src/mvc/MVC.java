/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controlador.ControladorJFPrincipal;
import Vista.JFPrincipal;

/**
 *
 * @author LAB_9
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFPrincipal windows = new JFPrincipal();
        ControladorJFPrincipal controlador = new ControladorJFPrincipal(windows);
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        
        
       System.out.println(Conexion.getInstance().conectar());
        
        
        
    }
    
}
