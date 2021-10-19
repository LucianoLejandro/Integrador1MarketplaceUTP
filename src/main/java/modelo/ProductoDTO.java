
package modelo;

/**
 * Integrador I
 * @author Grupo Integrador 
 */
public class ProductoDTO 
{
    private int ProdID;
    private String ProdNombre;
    private String ProdMarca;
    private String ProdPrecio;
    private String ProdDescripcion;
    private String Stock;    
    //private int IDCatalogo ;
    
    public ProductoDTO(int ProdID , String ProdNombre , String ProdMarca , String ProdPrecio, String ProdDescripcion, String Stock   ) 
    {
       
        this.ProdID = ProdID;
        this.ProdNombre = ProdNombre;
        this.ProdMarca  = ProdMarca ;
        this.ProdPrecio = ProdPrecio;
        this.ProdDescripcion = ProdDescripcion;
        this.Stock = Stock;
        //this.IDCatalogo = IDCatalogo;
    }
    
    //getter&setter

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int ProdID) {
        this.ProdID = ProdID;
    }

    public String getProdNombre() {
        return ProdNombre;
    }

    public void setProdNombre(String ProdNombre) {
        this.ProdNombre = ProdNombre;
    }

    public String getProdMarca() {
        return ProdMarca;
    }

    public void setProdMarca(String ProdMarca) {
        this.ProdMarca = ProdMarca;
    }

    public String getProdPrecio() {
        return ProdPrecio;
    }

    public void setProdPrecio(String ProdPrecio) {
        this.ProdPrecio = ProdPrecio;
    }

    public String getProdDescripcion() {
        return ProdDescripcion;
    }

    public void setProdDescripcion(String ProdDescripcion) {
        this.ProdDescripcion = ProdDescripcion;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }
    
    
}
