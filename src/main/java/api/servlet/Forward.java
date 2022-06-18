/**
 * @author @Euraks 18.06.2022
 */
package api.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forward")
public class Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        if (req.getParameter("id")==null){
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/notfound");
            requestDispatcher.forward(req,resp);
        } else {
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/forward.html");
            requestDispatcher.forward(req,resp);
        }

    }
}
