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
public class CalificacionDTO {
    private int CalifID;
    private String CalifNroStars;
    private String CalifComentario;

    public CalificacionDTO(int CalifID, String CaliroStars, String CalifComentario) {
        this.CalifID = CalifID;
        this.CalifNroStars = CaliroStars;
        this.CalifComentario = CalifComentario;
    }

    public int getCalifID() {
        return CalifID;
    }

    public void setCalifID(int CalifID) {
        this.CalifID = CalifID;
    }

    public String getCalifNroStars() {
        return CalifNroStars;
    }

    public void setCalifNroStars(String CalifNroStars) {
        this.CalifNroStars = CalifNroStars;
    }

    public String getCalifComentario() {
        return CalifComentario;
    }

    public void setCalifComentario(String CalifComentario) {
        this.CalifComentario = CalifComentario;
    }
    
    
}
