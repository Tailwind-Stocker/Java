import java.io.IOException;
import java.io.PrintWriter;
import javax.Servlet.RequestDispatcher;

@WebService("/Servlet1")
class RequestDispatcher extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String n = req.getParameter("user");
        String p = req.getParameter("pass");
        if (p.equals("admin") && n.equals("pass")) {
            RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
            rd.forward(req, res);
        } else {
            out.println("username/password incorrect");
            RequestDispatcher rd = RequestDispatcher("Index.html");
            rd.include(req, res);
        }
    }
}

@WebService("/Servlet2")

class Servlet2 extends HttpSevlet {
    public void doPost(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
        res.set(onTextType("text/html"));
        PrintWriter out = res.getWriter();
        String n = req.getParameter("user");
        out.println("Welcome " + n);
        out.close();
    }
}