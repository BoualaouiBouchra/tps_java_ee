package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exo1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

	String[] articlesEnInventaire={"qcm123","ads234","qwerty456","azerty567","cap789","down345","top765","jungle432","fire876","hi234"};
		String	articlesCherches ="down345";
                boolean	trouve	= false;
        int	trouveIndex	= -1;
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
      out.write("        <meta\thttp-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <H1>Recherche\tde\t");
      out.print(articlesCherches);
      out.write("\tau\tniveau\tde\tla\tbase:\n");
      out.write("        </H1>\n");
      out.write("        <UL>\n");
      out.write("       ");
 int	i =0;		
            while (!trouve&& i< articlesEnInventaire.length)	{
      out.write("\n");
      out.write("            <LI>Recherche index\t");
      out.print(	i);
      out.write(':');
      out.write(' ');
      out.print(articlesEnInventaire[i]);
      out.write("\n");
      out.write("                ");
if(articlesEnInventaire[i] ==articlesCherches)	{
                    trouve= true;
                    trouveIndex	= i;
                }
                i++;}	
      out.write("\n");
      out.write("        </UL>\n");
      out.write("        <H2>\n");
      out.write("            ");
	if(trouve) {
      out.write("\n");
      out.write("            Trouvé\tà index\t=");
      out.print(trouveIndex);
      out.write("\n");
      out.write("            ");
	} else	{
      out.write("\n");
      out.write("            Désolé,");
      out.print(articlesCherches);
      out.write("ne se trouve pas dans la base\n");
      out.write("            ");
	}
      out.write("\n");
      out.write("        </H2>\n");
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
