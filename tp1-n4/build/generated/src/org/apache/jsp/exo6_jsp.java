package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exo6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

	String	randomColor()	{
java.util.Random random	=new java.util.Random();
int	          red	=(int)	(random.nextFloat()*255);
int	          green	=(int)	(random.nextFloat()*255);
int	           blue	=(int)	(random.nextFloat()*255);
return	"#"+Integer.toString(red,16)+Integer.toString(green,16)+Integer.toString(blue,16);
				}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta\thttp-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("\t<title>JSPPage</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<body\tbgcolor=\"white\">\n");
      out.write("\n");
      out.write("<h1>Random Color</h1>\n");
      out.write("<table\tbgcolor=\"");
      out.print(randomColor());
      out.write("\">\n");
      out.write("<tr><td\twidth=\"100\"\theight=\"100\">&nbsp;</td></tr>\n");
      out.write("</table>\n");
      out.write("\t\t\t\t</body>\n");
      out.write("</body>\n");
      out.write("</html>");
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
