/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProductosDAO;
import Vista.JDProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_9
 */
public class ControladorJDProductos implements ActionListener{
    JDProductos VistaProductos;
    
    public ControladorJDProductos (JDProductos VistaProductos)
    {
        this.VistaProductos=VistaProductos;
        this.VistaProductos.btnIngreso.addActionListener(this);
        this.VistaProductos.btnBuscar.addActionListener(this);
        this.VistaProductos.btnEliminar.addActionListener(this);
    }
    
    

    public void actionPerformed(ActionEvent ae) {
        
        if(VistaProductos.btnIngreso==ae.getSource())
        {
            ProductosDAO Productos = new ProductosDAO();
        Productos.Ingreso(VistaProductos.txtDescripcion.getText(),Float.parseFloat(VistaProductos.txtPrecio.getText()),Integer.parseInt(VistaProductos.txtExistencia.getText()));
                  VistaProductos.txtCodigo.setText("");
                  VistaProductos.txtDescripcion.setText("");
                  VistaProductos.txtExistencia.setText("");
                  VistaProductos.txtPrecio.setText("");
        }
            
        if(VistaProductos.btnBuscar==ae.getSource())
             {
                  ProductosDAO nuevo = new ProductosDAO();
                  ResultSet datosobtenidos;
                  datosobtenidos= nuevo.buscar(Integer.parseInt(VistaProductos.txtCodigo.getText()));
        try
            {
                if(datosobtenidos.next())
                {
                    VistaProductos.txtDescripcion.setText(datosobtenidos.getString("descripcion"));
                    VistaProductos.txtPrecio.setText(datosobtenidos.getString("precio"));
                    VistaProductos.txtExistencia.setText(datosobtenidos.getString("existencia"));
                }
             else JOptionPane.showMessageDialog(null, "NO HAY REGISTROS PARA EL CÓDIGO");
         }
         catch(Exception e)
   
         {
                     JOptionPane.showMessageDialog(null, "Hubo un error al obtener los datos"+e);
                 }                         
             }
        
        if(VistaProductos.btnEliminar==ae.getSource())
        {
            
        }
        
        
           
        

    
    }
    
    
}
