import java.io.IOException;
import javax.Servlet.*;


class SendRedirect extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
    String n = req.getParameter("search");
    res.SendRedirect("https://www.google.co.in/search?q" + n);
}