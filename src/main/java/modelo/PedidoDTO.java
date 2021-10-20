
package modelo;

/**
 * Integrador I
 * @author Grupo Integrador
 */
public class PedidoDTO 
{
    private int PedidoID;
    private String Total;
    private String FechaPedido;
    private String FechaEntrega;    
    private String TipoPago;
    //private int ListPedidosID;
    //private int CID;
    
    public PedidoDTO(int PedidoID, String Total, String FechaPedido, String FechaEntrega, String TipoPago) 
    {
        
        this.PedidoID = PedidoID;
        this.Total = Total;
        this.FechaPedido = FechaPedido;        
        this.TipoPago = TipoPago;
    }
    
    //getter&setter
    public int getPedidoID() {
        return PedidoID;
    }

    public void setPedidoID(int PedidoID) {
        this.PedidoID = PedidoID;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

   

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }
    
}
