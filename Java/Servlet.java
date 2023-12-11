import java.io.IOException;
import java.io.PrintWriter;
import java.Servlet.*;

class Servlet extends HttpSevlet{
    public void doGet(HttpServletRequest req,
    HttpsServletRespone res) throws ServlettException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("Hello World!");
        out.close();
    }
}