package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exo2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

	String	article[]={"toaster","CD","diskette"};
        double	prix[]	={19.99,12.99,1.99};
        int	quantite[] ={2,	9,24};
        
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
      out.write("    <head>\n");
      out.write("       <meta\thttp-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("       <title>JSP Page</title>\n");
      out.write("    <body>\n");
      out.write("        <H1\tALIGN=\"center\">An Order\tForm</H1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <TABLE\tALIGN=\"center\" BGCOLOR=\"yellow\"\tBORDER=\"1\" WIDTH=\"75%\">\n");
      out.write("            <TR><TD>Article</TD>\n");
      out.write("                <TD>Prix</TD>\n");
      out.write("                <TD>Quantite</TD>\t\t\t\t\n");
      out.write("                <TD>Prix\tTotal</TD>\n");
      out.write("            </TR>");
for(int i=0;i<3;i++){
      out.write("\n");
      out.write("\t<TR>\n");
      out.write("            <TD>");
      out.print(	article[i]);
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(	prix[i]);
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(	quantite[i]);
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(	prix[i]	*	quantite[i]);
      out.write("</TD>\n");
      out.write("\t</TR>\n");
      out.write("        ");
	}	//end	for	loop	
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("    </body>\n");
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
