package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:15 GMT -->\n");
      out.write("    <!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Danh s&#225;ch đơn h&#224;ng</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("        <script src=\"js/jquery-1.12.4.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            int pages = 1;
            int total = 1;
            int lastPage = 1;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/order", "root", "admin");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select count(idorder) from `order`.`order`;");
            while (rs.next()) {
                total = rs.getInt(1);
            }
            lastPage = (total / 20) + 1;

            if (request.getParameter("pages") != null) {
                pages = Integer.parseInt(request.getParameter("pages"));
            }

            rs = st.executeQuery("SELECT * FROM `order`.`order` limit " + (pages - 1) * 20 + ",20");


        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header clearfix\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul class=\"nav nav-pills pull-right\">\n");
      out.write("                        <li role=\"presentation\" class=\"active\"><a href=\"index.jsp\">Danh sách</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"createOrder.jsp\">Tạo mới</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <h3 class=\"text-muted\">VNPAY DEMO</h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h3>Danh s&#225;ch đơn h&#224;ng</h3>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <!-- phan trang -->\n");
      out.write("                <ul class=\"pagination\"> \n");
      out.write("                    ");
                        int back = 0;
                        if (pages == 0 || pages == 1) {
                            back = 1;//Luon la page 1
                        } else {
                            back = pages - 1;//Neu pages tu 2 tro len thi back tru 1
                        }
                    
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(back);
      out.write("\">Back &laquo;</a></li>\n");
      out.write("                        ");
if (pages - 1 > 2) {
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=1\">1</a></li>\n");
      out.write("                    <li><a href=\"#\">...</a></li>\n");
      out.write("\n");
      out.write("                    ");
}
                        if (pages - 1 > 1) {
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(pages - 2);
      out.write("\" >");
      out.print(pages - 2);
      out.write("</a> </li>\n");
      out.write("                        ");
}
                            if (pages - 1 > 0) {
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(pages - 1);
      out.write('"');
      out.write('>');
      out.print(pages - 1);
      out.write("</a> </li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(pages);
      out.write('"');
      out.write('>');
      out.print(pages);
      out.write("</a></li>\n");
      out.write("                        ");
 if (lastPage - pages > 1) {
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(pages + 1);
      out.write('"');
      out.write('>');
      out.print(pages + 1);
      out.write("</a></li>\n");
      out.write("                        ");
}
                            if (lastPage - pages > 2) {
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(pages + 2);
      out.write('"');
      out.write('>');
      out.print(pages + 2);
      out.write("</a></li>\n");
      out.write("                        ");
}
                            if (lastPage - pages > 3) {
      out.write("\n");
      out.write("                    <li><a href=\"#\">...</a></li>\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(lastPage);
      out.write('"');
      out.write('>');
      out.print(lastPage);
      out.write("</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        ");

                            int next = pages;
                            if (pages == lastPage || pages == lastPage - 1) {
                                next = lastPage;
                            } else {
                                next = pages + 1;
                            }
                        
      out.write("\n");
      out.write("                    <li><a href=\"index.jsp?pages=");
      out.print(next);
      out.write("\"> &raquo; Next</a></li>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("                <table class=\"table table-bordered table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>\n");
      out.write("                                Mã\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                Số tiền\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                Nội dung\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                Ngày tạo\n");
      out.write("                            </th>\n");
      out.write("\n");
      out.write("                            <th>\n");
      out.write("                                Tình trạng\n");
      out.write("                            </th>\n");
      out.write("                            <th>\n");
      out.write("                                IpAddr\n");
      out.write("                            </th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
            
                            int i = 1;
                            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( rs.getInt(1));
      out.write("                   \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( rs.getInt(2));
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print( rs.getString(3));
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"center\">\n");
      out.write("                                ");
      out.print(rs.getDate(4));
      out.write(" \n");
      out.write("                                ");
      out.print( rs.getTime(6));
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <td class=\"center\">\n");
      out.write("                                <span class=\"pay-unsuccess\">\n");
      out.write("                                    ");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                127.0.0.1\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                \n");
      out.write("                                <form >\n");
      out.write("                                    <a href=\"Detail?pages=");
      out.print(pages);
      out.write("&id=");
      out.print(i);
      out.write("\"  >Chi tiết</a>\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getInt(1));
      out.write("\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                           \n");
      out.write("                            ");

                                i++;
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"pager\">\n");
      out.write("                    Số trang- thinking;\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p>&copy; VNPAY 2018</p>\n");
      out.write("            </footer>\n");
      out.write("        </div> <!-- /container -->\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"Styles/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:24 GMT -->\n");
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
