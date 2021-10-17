/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luciano
 */
public class Persona {
    private String IDNombres;
    private String Nombres;
    private String Apellidos;
    private int Edad;

    public Persona(String IDNombres, String Nombres, String Apellidos, int Edad) {
        this.IDNombres = IDNombres;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }
    public Persona(String Nombres, int Edad) {
        this.Nombres = Nombres;
        this.Edad = Edad;
    }

    public String getIDNombres() {
        return IDNombres;
    }

    public void setIDNombres(String IDNombres) {
        this.IDNombres = IDNombres;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
