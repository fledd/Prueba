/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mvc.Conexion;

/**
 *
 * @author LAB_9
 */
public class ProductosDAO implements Productos{
   
   
    public void Eliminar(int codigo) {
    }

   

    public void Ingreso(String descripcion, float precio, int existencia) {
        try {    
            Connection conn = Conexion.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call insertarProducto(?,?,?)}");
                  sentencia.setString("descripcion",descripcion);
                  sentencia.setFloat("precio",precio);
                  sentencia.setInt("existencia",existencia);
                JOptionPane.showMessageDialog(null,"Ingresado correctamente");   
            sentencia.execute();
        } 
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar el producto a la base de datos " + ex.getLocalizedMessage());
        }   
    
    }

    public ResultSet buscar(int codigo) {

        try{
             
            Connection conn = Conexion.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call buscarProducto(?)}");
            sentencia.setInt(1, codigo);
            ResultSet resultado = sentencia.executeQuery();
            
            return resultado;
        }   
        catch(Exception e){
            return null;
        }
        
        
    }
    
    
}
