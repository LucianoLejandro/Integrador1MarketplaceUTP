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
public class comprador {
    private int CID;    
    private String CNombres;
    private String CApellidoP;
    private String CApellidoM;
    private String CDNI;
    private String CTelefono;
    private int CodDireccion;

    public comprador(int CID, String CNombres, String CApellidoP, String CApellidoM, String CDNI, String CTelefono, int CodDireccion) {
        this.CID = CID;
        this.CNombres = CNombres;
        this.CApellidoP = CApellidoP;
        this.CApellidoM = CApellidoM;
        this.CDNI = CDNI;
        this.CTelefono = CTelefono;
        this.CodDireccion = CodDireccion;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getCNombres() {
        return CNombres;
    }

    public void setCNombres(String CNombres) {
        this.CNombres = CNombres;
    }

    public String getCApellidoP() {
        return CApellidoP;
    }

    public void setCApellidoP(String CApellidoP) {
        this.CApellidoP = CApellidoP;
    }

    public String getCApellidoM() {
        return CApellidoM;
    }

    public void setCApellidoM(String CApellidoM) {
        this.CApellidoM = CApellidoM;
    }

    public String getCDNI() {
        return CDNI;
    }

    public void setCDNI(String CDNI) {
        this.CDNI = CDNI;
    }

    public String getCTelefono() {
        return CTelefono;
    }

    public void setCTelefono(String CTelefono) {
        this.CTelefono = CTelefono;
    }

    public int getCodDireccion() {
        return CodDireccion;
    }

    public void setCodDireccion(int CodDireccion) {
        this.CodDireccion = CodDireccion;
    }

    
    
    
}
