package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<!-- Mirrored from sandbox.vnpayment.vn/tryitnow/Home/OrderDetail/101022 by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:30 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Chi ti?t</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"https://sandbox.vnpayment.vn/tryitnow/Content/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"https://sandbox.vnpayment.vn/tryitnow/Styles/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"/tryitnow/Styles/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"https://sandbox.vnpayment.vn/tryitnow/Styles/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\n");
      out.write("    <![endif]-->\n");
      out.write("     <script src=\"https://sandbox.vnpayment.vn/tryitnow/Scripts/jquery-1.12.4.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"header clearfix\">\n");
      out.write("            <nav>\n");
      out.write("                <ul class=\"nav nav-pills pull-right\">\n");
      out.write("                        <li role=\"presentation\" class=\"active\"><a href=\"https://sandbox.vnpayment.vn/tryitnow/\">Danh sách</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"https://sandbox.vnpayment.vn/tryitnow/Home/CreateOrder\">T?o m?i</a></li>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <h3 class=\"text-muted\">VNPAY DEMO</h3>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<h3>Chi ti?t</h3>\n");
      out.write("<div class=\"table-responsive\">\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"OrderId\">Mã ??n hàng</label>\n");
      out.write("        101022\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"Amount\">S? ti?n</label>\n");
      out.write("        10000.00\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"OrderDescription\">N?i dung thanh toán</label>\n");
      out.write("        Thanh toan don hang thoi gian: 2018-06-15 16:23:58\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label >Tr?ng thái</label>\n");
      out.write("                <span class=\"pay-error\">GD L?i</span>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("    <a href=\"https://sandbox.vnpayment.vn/tryitnow/\">V? danh s&#225;ch</a>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <p>&copy; VNPAY 2018</p>\n");
      out.write("        </footer>\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("<script src=\"https://sandbox.vnpayment.vn/tryitnow/Styles/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("     \n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from sandbox.vnpayment.vn/tryitnow/Home/OrderDetail/101022 by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:30 GMT -->\n");
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
