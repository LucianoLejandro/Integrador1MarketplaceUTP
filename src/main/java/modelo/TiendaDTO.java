
package modelo;

/**
 * Integrador I
 * @author Grupo Integrador
 */
public class TiendaDTO 
{
    private int TRUC;
    private String TNombre;
    private String TDescripcion;
    
    private String Distrito;

    public TiendaDTO(int TRUC, String TNombre, String TDescripcion, String Distrito ) {
       
        this.TRUC = TRUC;
        this.TNombre = TNombre;
        this.TDescripcion = TDescripcion;
       
        this.Distrito = Distrito;
    }
    //getter&setter

    public int getTRUC() {
        return TRUC;
    }

    public void setTRUC(int TRUC) {
        this.TRUC = TRUC;
    }

    public String getTNombre() {
        return TNombre;
    }

    public void setTNombre(String TNombre) {
        this.TNombre = TNombre;
    }

    public String getTDescripcion() {
        return TDescripcion;
    }

    public void setTDescripcion(String TDescripcion) {
        this.TDescripcion = TDescripcion;
    }
     

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }
    
    
    
    
}
