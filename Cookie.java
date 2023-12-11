import java.io.IOException;
import java.io.PrintWriter;
import javax.Servlet.http.Cookie;


@WebService("/Servlet1")
class Cookie extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("user");
        String pass = req.getParameter("pass");

        out.println("<h1>" + name + "</h1>");

        Cookie c = new Cookie("username", name);
        res.addCookie();
        Cookie c1 = new Cookie("password", "1234");
        res.addCookie();
        out.println("<form action = 'Servlet2' method = 'post' >");
        out.println("<input type = 'Submit' value = 'GO' >");
        out.println("</form>");
    }

    @WebService("/Servlet2")

    class Servlet2 extends HttpSevlet {
    public void doGet(HttpServletRequest req,
            HttpsServletRespone res) throws ServlettException, IOException {
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
                Cookie ck[] = req.getCookie();
                for(int i = 0 ; i < ck.length ; i++){
                    out.println("<br>" ck[i].getName() + " " + ck[i].getValue);
                }
            }
}