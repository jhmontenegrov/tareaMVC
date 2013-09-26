/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.MEmpleado;
/**
 *
 * @author 202
 */
@WebServlet(name = "empleado", urlPatterns = {"/empleado"})
public class Empleado extends HttpServlet {
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String accion = request.getParameter("a");
        if (accion.equals("crear")){
            dispatcher= request.getRequestDispatcher("WEB-INF/vistas/empleado/formulario.html");
        dispatcher.forward(request, response);
        }
        if (accion.equals("guardar")){
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("Apellido");
            String genero=request.getParameter("genero");
            String financiacion=request.getParameter("financiacion");
            String nacimiento=request.getParameter("fecha en que nacio");
        }
        if (accion.equals("ver")){
            response.getWriter().println("ver");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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