import java.io.IOException;
import java.io.PrintWriter;
import javax.Servlet.http.*;

@WebService("/Servlet1")
class Session extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("user");
        out.println("Welcome " + name);

        HttpSession session = req.getSession();
        session.setAttribute("UNAME", name);
        out.println("<form action = 'Servlet2' method = 'post' >");
        out.println("<input type = 'Submit' value = 'GO' >");
        out.println("</form>");
        out.close();
    }
}

@WebService("/Servlet2")

class Servlet2 extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false);
        String n = (String) sessioln.getAttribute("uname");
        out.println("Welcome " + n);
    }
}