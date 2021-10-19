/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mp.marketplaceutp.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author luciano
 */
public class VendedorDAO {
    Connection miConexion;
    Statement miStatement;
    ResultSet miResultSet;
    Conexion con;
    
    public VendedorDAO(){
        miConexion = con.Conexion();
    }
    
    public int Insertar(VendedorDTO v1){
        int bandera = 0;
        try {
            String query = "insert into Vendedor (VNombres,VApellidoP,VApellidoM,VUsuario,Vcontrasenia)"
                        +" values ('"+v1.getVNombres()+"','"+v1.getVApellidoP()+"','"+v1.getVApellidoM()+"','"+v1.getVUsuario()+"','"+v1.getVcontrasenia()+"')";
            miStatement = miConexion.createStatement();
            bandera = miStatement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
    }
}
