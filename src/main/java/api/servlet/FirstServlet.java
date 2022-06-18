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
        try (PrintWriter printWriter = resp.getWriter()) {
            printWriter.write("Parameter Id = " + req.getParameter("id") + " /");
            printWriter.println();
            printWriter.write("Name " + req.getParameter("name") + " age = " + req.getParameter("age"));
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {

        response.setContentType("text/html");

        try (PrintWriter writer = response.getWriter()) {
            String name = request.getParameter("username");
            String age = request.getParameter("userage");
            String gender = request.getParameter("gender");
            String country = request.getParameter("country");
            String[] courses = request.getParameterValues("courses");
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Country: " + country + "</p>");
            writer.println("<h4>Courses</h4>");
            for (String course : courses)
                writer.println("<li>" + course + "</li>");
        }
    }
}
