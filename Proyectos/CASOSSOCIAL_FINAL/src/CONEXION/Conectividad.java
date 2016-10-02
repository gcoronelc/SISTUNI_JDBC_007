
package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*; 
/** 
 * 
 *
 */ 
public class Conectividad { 
    String driver = "oracle.jdbc.OracleDriver";
    String urlDB = "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "adm";
    String pass = "adm";
    
    private Connection conexion; 
    
    public Connection getConexion() { 
        return conexion; 
    }    

    public void setConexion(Connection conexion) { 
        this.conexion = conexion; 
    }  

    public Conectividad conectar() { 
        try { 
            Class.forName("oracle.jdbc.OracleDriver"); 
  
            conexion = DriverManager.getConnection(urlDB, user, pass);             
            if (conexion != null) { 
                System.out.println("Conexion exitosa!"); 
            } else { 
                System.out.println("Conexion fallida!"); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }        return this; 
    } 

    public boolean escribir(String sql) { 
        try { 
            Statement sentencia=null;
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql); 
            getConexion().commit(); 
            sentencia.close(); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            System.out.print("ERROR SQL"); 
            return false; 
        }         
        return true; 
    } 
    public ResultSet consultar(String sql) { 
        ResultSet resultado = null; 
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return null; 
        }        return resultado; 
    } 

}