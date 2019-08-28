package servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String contenttype = "text/html;charset-UTF-8";
        response.setContentType(contenttype);
        
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        // El elemento tecnología puede tener varios
        // valores, por ellos procesamos como un arreglo.
        String[] tecnologias = request.getParameterValues("tecnologia");
        String genero = request.getParameter("sexo");
        String ocupacion = request.getParameter("ocupacion");
        String[] musicas = request.getParameterValues("musica") != null ? request.getParameterValues("musica") : new String[] {"No Seleccionado"};        
        
        String comentario = request.getParameter("comentario");
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='utf8'>");
        out.println("<title>Resultado Servlet</title>");        
        out.println("</head>");
        
        // Body
        out.println("<body>");
        
        out.println("<h1>Parametros procesados por el servlet:</h1>");
        // tabla
        out.println("<table border='1'>");
        out.println("<thead>");
        
        out.println("<tr>");
        
        out.println("<th>");
        out.println("Usuario");
        out.println("</th>");
        out.println("<th>");
        out.println("Password");
        out.println("</th>");        
        out.println("<th>");
        out.println("Tecnologías");
        out.println("</th>");
        out.println("<th>");
        out.println("Género");
        out.println("</th>");
        out.println("<th>");
        out.println("Ocupación");
        out.println("</th>");
        out.println("<th>");
        out.println("Música favorita");
        out.println("</th>");
        out.println("<th>");
        out.println("Comentarios");
        out.println("</th>");
        
        out.println("</tr>");
        
        out.println("</thead>");
        
        out.println("<tbody>");
        out.println("<tr>");
        
        out.println("<td>");
        out.println(usuario);
        out.println("</td>");
        
        out.println("<td>");
        out.println(password);
        out.println("</td>");
        
        out.println("<td>");
        // Tecnologias es multivalor.
        // Recorrer el array.
        for (String tecnologia : tecnologias) {
            out.println(tecnologia);
            out.println(" / ");
        }
        out.println("</td>");
        
        out.println("<td>");
        out.println(genero);
        out.println("</td>");                
        
        out.println("<td>");
        out.println(ocupacion);
        out.println("</td>");
        
        out.println("<td>");
        // Música es multivalor.
        // Recorrer el array.
        for (String musica : musicas) {
            out.println(musica);   
            out.println(" / ");
        }        
        out.println("</td>");
        
        out.println("<td>");
        out.println(comentario);
        out.println("</td>");
        
        out.println("<tr>");
        out.println("<tbody>");
        
        out.println("</table>");
        
        out.println("</body>");
        // Fin Body
        
        out.println("</html>");
        
    }
    
}