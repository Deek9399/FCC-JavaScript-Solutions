package in.ac.uohyd.ssn;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/** Servlet that says "Welcome aboard" to first-time
 *  visitors and "Welcome back" to repeat visitors.
 *  <p>
 *  Some of the code is adapted from <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

@WebServlet("/repeat-visitor")
public class RepeatVisitor extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    boolean newbie = true;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for(Cookie c: cookies) {
        if ((c.getName().equals("repeatVisitor")) &&
            (c.getValue().equals("yes"))) {
          newbie = false;
          break;
        }
      }
    }
    String title;
    if (newbie) {
      Cookie returnVisitorCookie =
        new Cookie("repeatVisitor", "yes");
      returnVisitorCookie.setMaxAge(60*60*24*365); // 1 year
      response.addCookie(returnVisitorCookie);
      title = "Welcome Aboard";
    } else {
      title = "Welcome Back";
    }
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String docType =
      "<!DOCTYPE HTML >\n";
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                "</BODY></HTML>");
  }
}
