package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.*;

public final class showOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("     \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
            
            
            int pages = 1;
            int lastPage = 10;
            
            if (request.getParameter("pages")!= null)
                pages = Integer.parseInt(request.getParameter("pages"));
            
                
        
      out.write("\n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("            <ul class=\"pagination\"> \n");
      out.write("\n");
      out.write("                ");
               
                    int back = 0;
                    if (pages == 0 || pages == 1) {
                        back = 1;
                    } else {
                        back = pages - 1;
                    }
                
      out.write("\n");
      out.write("                <li><a href=\"Forward\" >Back &laquo;</a></li>\n");
      out.write("                    ");
if (pages - 1 > 2) {
      out.write("\n");
      out.write("                <li><a href=\"\">...</a></li>\n");
      out.write("                    ");
}
                        if (pages - 1 > 1) {
      out.write("\n");
      out.write("                <li><a href=\"Forward\" >");
      out.print(pages - 2);
      out.write("</a> </li>\n");
      out.write("                    ");
}
                        if (pages - 1 > 0) {
      out.write("\n");
      out.write("                <li><a href=\"showOrder.jsp?pages=");
      out.print(pages - 1);
      out.write('"');
      out.write('>');
      out.print(pages - 1);
      out.write("</a> </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                <li><a href=\"showOrder.jsp?pages=");
      out.print(pages);
      out.write('"');
      out.write('>');
      out.print(pages);
      out.write("</a></li>\n");
      out.write("                    ");
 if (lastPage - pages > 1) {
      out.write("\n");
      out.write("                <li><a href=\"showOrder.jsp?pages=");
      out.print(pages + 1);
      out.write('"');
      out.write('>');
      out.print(pages + 1);
      out.write("</a></li>\n");
      out.write("                    ");
}
                        if (lastPage - pages > 2) {
      out.write("\n");
      out.write("                <li><a href=\"showOrder.jsp?pages=");
      out.print(pages + 2);
      out.write('"');
      out.write('>');
      out.print(pages + 2);
      out.write("</a></li>\n");
      out.write("                    ");
}
                        if (lastPage - pages > 3) {
      out.write("\n");
      out.write("\n");
      out.write("                <li><a href=\"#\">...</a></li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");

                        int next = lastPage;
                        if (pages != lastPage || pages != lastPage - 1) {
                            next = pages + 1;
                        }
                    
      out.write("\n");
      out.write("                <li><a href=\"showOrder.jsp?pages=");
      out.print(next);
      out.write("\"> &raquo; Next</a></li>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            ");

      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Mã\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Số tiền\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Nội dung\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Ngày tạo\n");
      out.write("                        </th>\n");
      out.write("\n");
      out.write("                        <th>\n");
      out.write("                            Tình trạng\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            IpAddr\n");
      out.write("                        </th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                           \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                          \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"center\">\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td class=\"center\">\n");
      out.write("                            <span class=\"pay-unsuccess\">\n");
      out.write("                                \n");
      out.write("                            </span>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            127.0.0.1\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"TestJava\" method=\"post\">Chi tiết</a>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                      \n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"pager\">\n");
      out.write("                Số trang- thinking;\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
