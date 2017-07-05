package mvc;

import java.sql.*;

   
  public class Conexion {
     
     Connection conn;
     
      private static class SingletonHolder{
         public static final Conexion INSTANCE = new Conexion();
     }
     
     public static Conexion getInstance(){
         return SingletonHolder.INSTANCE;
     }
 
     public String conectar()
     {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/farmacia1", "root", "");
             return "Se ha conectado a la base de datos";
         }
         catch (Exception e)
         {
             return "Ocurrió un error al conectar con la base de datos " + e.getLocalizedMessage();
         }
     }
     
     public Connection getConexion()
     {
         return conn;
     }
  
  }
   