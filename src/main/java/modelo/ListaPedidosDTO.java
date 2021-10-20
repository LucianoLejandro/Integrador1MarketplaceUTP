/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Grupo Integrador I
 */
public class ListaPedidosDTO 
{
    private int ListPedidosID;
    private String ListPedidosCantida;
    private String ListPedidosPrecio;
    
    
    public ListaPedidosDTO(int ListPedidosID , String ListPedidosCantida, String ListPedidosPrecio ) 
    {       
        this.ListPedidosID = ListPedidosID;
        this.ListPedidosCantida = ListPedidosCantida;
        this.ListPedidosPrecio = ListPedidosPrecio;       
       
    } 

    public int getListPedidosID() {
        return ListPedidosID;
    }

    public void setListPedidosID(int ListPedidosID) {
        this.ListPedidosID = ListPedidosID;
    }

    public String getListPedidosCantida() {
        return ListPedidosCantida;
    }

    public void setListPedidosCantida(String ListPedidosCantida) {
        this.ListPedidosCantida = ListPedidosCantida;
    }

    public String getListPedidosPrecio() {
        return ListPedidosPrecio;
    }

    public void setListPedidosPrecio(String ListPedidosPrecio) {
        this.ListPedidosPrecio = ListPedidosPrecio;
    }
     
    
}
