/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mp.marketplaceutp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luciano
 */
public class Conexion {
    Connection miConexion = null;
    
    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/marketplace08102021v4","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miConexion;
    }
    //PAra sacar de aqui
    /*
    public int Insertar(VendedorDTO v){
        int bandera = 0;
        try {
            String query = "insert into Vendedor (VNombres,VApellidoP,VApellidoM,VUsuario,Vcontrasenia)"
            +" values ('"+v.getVNombres()+"','"+v.getVApellidoP()+"','"+v.getVApellidoM()+"','"+v.getVUsuario()+"','"+v.getVcontrasenia()+"')";
            miStatement = miConexion.createStatement();
            bandera = miStatement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
    }
    */
}
