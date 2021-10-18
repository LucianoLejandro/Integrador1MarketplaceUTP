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
public class VendedorDTO {
    private int idvendedor;
    private String VNombres;
    private String VApellidoP;
    private String VApellidoM;
    private String VUsuario;
    private String Vcontrasenia;

    public VendedorDTO(String VNombres, String VApellidoP, String VApellidoM, String VUsuario, String Vcontrasenia) {
        
        this.VNombres = VNombres;
        this.VApellidoP = VApellidoP;
        this.VApellidoM = VApellidoM;
        this.VUsuario = VUsuario;
        this.Vcontrasenia = Vcontrasenia;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getVNombres() {
        return VNombres;
    }

    public void setVNombres(String VNombres) {
        this.VNombres = VNombres;
    }

    public String getVApellidoP() {
        return VApellidoP;
    }

    public void setVApellidoP(String VApellidoP) {
        this.VApellidoP = VApellidoP;
    }

    public String getVApellidoM() {
        return VApellidoM;
    }

    public void setVApellidoM(String VApellidoM) {
        this.VApellidoM = VApellidoM;
    }

    public String getVUsuario() {
        return VUsuario;
    }

    public void setVUsuario(String VUsuario) {
        this.VUsuario = VUsuario;
    }

    public String getVcontrasenia() {
        return Vcontrasenia;
    }

    public void setVcontrasenia(String Vcontrasenia) {
        this.Vcontrasenia = Vcontrasenia;
    }
    
    
}
