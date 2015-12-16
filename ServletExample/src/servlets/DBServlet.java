package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DBServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");

        out.println("<title>First servlet</title>");
        out.println("</head>");
        out.println("<body>");

        DBUtils DBUtils = new DBUtils();
        DBUtils.connect();
        out.println(DBUtils.showData());

        out.println("<hr>");

        out.println("</body>");
        out.println("</html>");
    }
}


 