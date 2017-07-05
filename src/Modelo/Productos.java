/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;

/**
 *
 * @author LAB_9
 */
public interface Productos {
    public void Ingreso (String descripcion,float precio, int existencia);
    public void Eliminar (int codigo);
    public ResultSet buscar(int codigo);
}
