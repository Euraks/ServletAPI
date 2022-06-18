/**
 * @author @Euraks 18.06.2022
 */
package api.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/notfound")
public class NotFoundServlet extends Forward {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try(PrintWriter printWriter = resp.getWriter()) {
            printWriter.println("<H2> Not Found id = "+req.getParameter("id")+"</H2>");

        }
    }
}
