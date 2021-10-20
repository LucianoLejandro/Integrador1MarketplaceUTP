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
    Connection miConnection = null;
    Statement miStatement = null;
    ResultSet miResultSet = null;
    //Conexion con2 = null;
    
    private Connection Llamar_getConexion(){
        this.miConnection = Conexion.getConexion();
        return this.miConnection;
    }
    
    public int Insertar(VendedorDTO v1){
        int bandera = 0;
        try {
            String query = "insert into Vendedor (VNombres,VApellidoP,VApellidoM,VUsuario,Vcontrasenia)"
                        +" values ('"+v1.getVNombres()+"','"+v1.getVApellidoP()+"','"+v1.getVApellidoM()+"','"+v1.getVUsuario()+"','"+v1.getVcontrasenia()+"')";
            
            //miConnection = Llamar_getConexion();
            miConnection = Conexion.getConexion();
            
            miStatement = miConnection.createStatement();
            bandera = miStatement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Probando el método Leer()
        Leer();
        return bandera;
    }
    
    public void Leer(){
        int banderaRead=0;
        try {
            String query = "SELECT * FROM `Vendedor`";
            miStatement = miConnection.createStatement();
            miResultSet = miStatement.executeQuery(query);
            
            while (miResultSet.next()){

                int idvendedor = miResultSet.getInt("idvendedor");
                String VNombres = miResultSet.getString("VNombres");
                String VApellidoP = miResultSet.getString("VApellidoP");
                String VApellidoM = miResultSet.getString("VApellidoM");
                String VUsuario = miResultSet.getString("VUsuario");
                String Vcontrasenia = miResultSet.getString("Vcontrasenia");

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s\n", idvendedor, VNombres, VApellidoP, VApellidoM, VUsuario, Vcontrasenia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
