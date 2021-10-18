/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//by Lourdes
package controlador;

import com.mp.marketplaceutp.Conexion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.VendedorDTO;

/**
 *
 * @author luciano
 */
public class cvendedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //String idvendedor = request.getParameter("txtidvendedor");
        String vnombres = request.getParameter("txtvnombres");
        String vapellidop = request.getParameter("txtvapellidop");
        String vapellidom = request.getParameter("txtvapellidom");
        String vusuario = request.getParameter("txtvusuario");
        String vcontrasenia = request.getParameter("txtvcontrasenia");
        
        if(vnombres.equals("") || vapellidop.equals("") || vapellidom.equals("") || vusuario.equals("") || vcontrasenia.equals("")){
            String error = "campos sin llenar";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("errores.jsp").forward(request, response);
        }
        else{
/*            int idvend = 0;
            try {
                idvend = Integer.parseInt(idvendedor);
            } catch (NumberFormatException ex) {
                String error = "Solo debes colocar numeros en edad";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("errores.jsp").forward(request, response);
            }
*/
            VendedorDTO v1 = new VendedorDTO(vnombres, vapellidop, vapellidom, vusuario, vcontrasenia);
            Conexion cn = new Conexion();
            
            if (cn.Insertar(v1) > 0){
                request.getRequestDispatcher("exito.jsp").forward(request, response);
                //Devolviendo valores insertados a web exito.jsp
                //request.getSession().setAttribute("persona1", p1);

            }
            else{
                String error = "Error al insertar";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("errores.jsp").forward(request, response);
            }
            
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
