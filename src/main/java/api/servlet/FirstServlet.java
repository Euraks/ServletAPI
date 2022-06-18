/**
 * @author @Euraks 17.06.2022
 */
package api.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index")
public class FirstServlet extends HttpServlet {
    String string = "Hello i am Servlet";
    @Override
    public void init()  {
        string="Hello method init() is running";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(string);
        printWriter.close();
    }
}
