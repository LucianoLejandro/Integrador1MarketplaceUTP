
package modelo;

/**
 * Integrador I
 * @author Grupo Integrador 
 */
public class List_ProductoDTO 
{
    private int ListProductoID;
    private String Descripcion;
    
     public List_ProductoDTO(int ListProductoID , String Descripcion ) 
    {
       
        this.ListProductoID = ListProductoID;
        this.Descripcion = Descripcion;
        
        //this.ListPedidosID  = ListPedidosID ;
        //this.ProdID   = ProdID  ;
        
    } 
    //getter&setter

    public int getListProductoID() {
        return ListProductoID;
    }

    public void setListProductoID(int ListProductoID) {
        this.ListProductoID = ListProductoID;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
  
    
}
