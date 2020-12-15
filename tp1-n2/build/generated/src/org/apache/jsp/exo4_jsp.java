package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exo4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./Header.jsp");
    _jspx_dependants.add("/./Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE\thtml>\n");
      out.write("\n");
      out.write("<!DOCTYPE\thtml>\n");
      out.write("<html>\n");
      out.write("\t\t\t\t<head>\n");
      out.write("\t\t\t\t\t\t\t\t<meta\thttp-equiv=\"Content-Type\"\tcontent=\"text/html;\tcharset=UTF-8\">\n");
      out.write("\t\t\t\t\t\t\t\t<title>JSP\tPage</title>\n");
      out.write("\t\t\t\t</head>\n");
      out.write("\t\t\t\t<body\tstyle=\"font-family:verdana,arial;font-size:10pt;\">\n");
      out.write("\t\t\t\t\t\t\t\t<table\twidth=\"100%\"\theight=\"100%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr\tbgcolor=\"#99CCCC\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\talign=\"right\"\theight=\"15%\">Bienvenue\tdans\tcet\texemple...</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\theight=\"75%\">");
      out.write("\n");
      out.write("<p\talign=\"center\">Le\tContenu\ton\tle\tplace\tici...</p>\n");
      out.write("\n");
      out.write("<!DOCTYPE\thtml>\n");
      out.write("<html>\n");
      out.write("\t\t\t\t<head>\n");
      out.write("\t\t\t\t\t\t\t\t<meta\thttp-equiv=\"Content-Type\"\tcontent=\"text/html;\tcharset=UTF-8\">\n");
      out.write("\t\t\t\t\t\t\t\t<title>JSP\tPage</title>\n");
      out.write("\t\t\t\t</head>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("</tr>\n");
      out.write("<tr\tbgcolor=\"\t#99CC99\">\n");
      out.write("\t\t\t<td\talign=\"center\"\theight=\"10%\">Copyright\tAKYA\tMedia\t2015</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
