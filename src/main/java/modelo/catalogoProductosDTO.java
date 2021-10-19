/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Integrador I
 * @author Grupo Integrador 
 */
public class catalogoProductosDTO 
{
    private int IDCatalogo ;
    private String marcas ;
    private String presentaciones ;
    private String unidadesMedida ;
    //private int TRUC ;

    public catalogoProductosDTO(int IDCatalogo , String marcas , String presentaciones , String unidadesMedida ) {
       
        this.IDCatalogo = IDCatalogo;
        this.marcas = marcas;
        this.presentaciones  = presentaciones ;
        this.unidadesMedida = unidadesMedida;
        //this.TRUC = TRUC;
    }

    //getter&setter
    public int getIDCatalogo() {
        return IDCatalogo;
    }

    public void setIDCatalogo(int IDCatalogo) {
        this.IDCatalogo = IDCatalogo;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(String presentaciones) {
        this.presentaciones = presentaciones;
    }

    public String getUnidadesMedida() {
        return unidadesMedida;
    }

    public void setUnidadesMedida(String unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }
    
    
}
