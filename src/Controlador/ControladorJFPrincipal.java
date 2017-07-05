/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JDCLientes;
import Vista.JDProductos;
import Vista.JFPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LAB_9
 */
public class ControladorJFPrincipal implements ActionListener{
    JFPrincipal VistaPrincipal;
    
    public ControladorJFPrincipal (JFPrincipal VistaProductos)
    {
        this.VistaPrincipal=VistaProductos;
        this.VistaPrincipal.btnProductos.addActionListener(this);
        this.VistaPrincipal.btnClientes.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(VistaPrincipal.btnProductos == e.getSource())
        {
            
        
    JDProductos VistaProductos = new JDProductos(new JFPrincipal(), true);
    VistaProductos.setLocationRelativeTo(null);
    VistaProductos.setVisible(true);
    
    }else
        {
            if(VistaPrincipal.btnClientes == e.getSource())
            {
                JDCLientes VistaClientes = new JDCLientes(new JFPrincipal(), true);
                VistaClientes.setLocationRelativeTo(null);
                VistaClientes.setVisible(true);
                
            }
        }
    }
    
}
