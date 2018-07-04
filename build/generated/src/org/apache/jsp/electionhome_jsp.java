package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class electionhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lato|Montserrat|Open+Sans:300|Oswald|Raleway|Roboto\" rel=\"stylesheet\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\n");
      out.write("           \n");
      out.write("        <!--jQuery library--> \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!--Latest compiled and minified JavaScript--> \n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <title>VoteForGood</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link  rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav navbar-inverse\">\n");
      out.write("            <div class=\"container \">\n");
      out.write("                <div class=\"navbar-brand navbar-nav aa\">\n");
      out.write("                <a class=\"myfont\" href=\"#\">VoteForGood</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right ab\">\n");
      out.write("                    <li class=\"myfont\"><a href=\"about.html\">About us <span class=\"glyphicon glyphicon-user\"></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("        <p>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write(" <div class=\"container col_head\">\n");
      out.write("     <center>\n");
      out.write("                      <div class=\"panel panel-default color_p\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"jumbotron \">\n");
      out.write("                            <h2 class=\"myfont\"><strong>Election Survey 2019</strong></h2>\n");
      out.write("                            <p>change your language here:</p> \n");
      out.write("                               <div class=\"col-sm-6\">  \n");
      out.write("                                   <a href=\"hindi.jsp\" class=\"btn btn-success aa\">?????</a>\n");
      out.write("                               </div> <p><p> <div href=\"telugu.jsp\" class=\"col-sm-6\"> \n");
      out.write("                                   <a class=\"btn btn-success ab\"> ??????</a></div>  \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                        <p><strong>You decide the nation</strong> </p>\n");
      out.write("     </div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                   \n");
      out.write("                    <form class=\"form-horizontal\" action=\"Elections.java\">\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                        <input type=\"text\"  class=\"form-control form-group\" name=\"uname\" placeholder=<center>\"Enter Your Name\"</center> >\n");
      out.write("                             <label> Age :</label><p>\n");
      out.write("                           \n");
      out.write("                                    <input type=\"radio\" name=\"uage\" value=\"adult\">18+<br>\n");
      out.write("                                   <input type=\"radio\" name=\"uage\" value=\"child\">18-<br>\n");
      out.write("                                   <label> Constituency  :</label><p><p>\n");
      out.write("                                  <select name=\"uconst\" class=\"form-control \" >\n");
      out.write("                                    <option value=\"kmm\">Khammam</option>\n");
      out.write("                                    <option value=\"hyd\">Rangareddy</option>\n");
      out.write("                                    <option value=\"srpt\">Suryapet</option>\n");
      out.write("                                    <option value=\"spl\">Sathupalli</option>\n");
      out.write("                                    \n");
      out.write("                                  </select>   <p><p>\n");
      out.write("                                   <label  >Party  </label> <p>\n");
      out.write("                                 <select name=\"uparty\" class=\"form-control col-lg-10\">\n");
      out.write("                                     <option value=\"trs\">TRS</option>\n");
      out.write("                                    <option value=\"tdp\">TDP</option>\n");
      out.write("                                    <option value=\"ysrcp\">YSRCP</option>\n");
      out.write("                                    <option value=\"bjp\">BJP</option>\n");
      out.write("                                    <option value=\"aimim\">AIMIM</option>\n");
      out.write("                                    <option value=\"cpi\">CPI</option>\n");
      out.write("                                    <option value=\"srpt\">NOTA</option>\n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                                 </select><p><p><p>\n");
      out.write("                                    \n");
      out.write("                                   <button type=\"submit\" class=\"btn btn-success btn-block\">VOTE</button>                                                  \n");
      out.write("                    </form>                                         \n");
      out.write("                </div>  \n");
      out.write("            \n");
      out.write("\n");
      out.write("                   \n");
      out.write("      </div>\n");
      out.write(" </center>                                   \n");
      out.write(" </div>                                       \n");
      out.write("  \n");
      out.write("</html>\n");
      out.write("\n");
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
