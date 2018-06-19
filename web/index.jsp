<%-- 
    Document   : cuong
    Created on : Jun 14, 2018, 5:51:40 PM
    Author     : cuongvm
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:15 GMT -->
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Danh s&#225;ch đơn h&#224;ng</title>
        <link href="css/bootstrap.min.css" rel="stylesheet"/>
        <link href="css/jumbotron-narrow.css" rel="stylesheet">
        <script src="js/js/ie-emulation-modes-warning.js"></script>
        <script src="js/jquery-1.12.4.min.js"></script>
    </head>

    <body>

        <%
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

            rs = st.executeQuery("SELECT * FROM `order`.`order` order by idorder DESC limit " + (pages - 1) * 20 + ",20");


        %>
        <div class="container">
            <div class="header clearfix">
                <nav>
                    <ul class="nav nav-pills pull-right">
                        <li role="presentation" class="active"><a href="index.jsp">Danh sách</a></li>
                        <li role="presentation"><a href="createOrder.jsp">Tạo mới</a></li>


                    </ul>
                </nav>
                <h3 class="text-muted">VNPAY DEMO</h3>
            </div>

            <h3>Danh s&#225;ch đơn h&#224;ng</h3>


            <div class="table-responsive">
                <!-- top pagination -->
                <div class="pager">
                    <ul class="pagination"> 
                        <%                        
                            int back = 0;
                            if (pages == 0 || pages == 1) {
                                back = 1;//Luon la page 1
                            } else {
                                back = pages - 1;//Neu pages tu 2 tro len thi back tru 1
                            }
                        %>
                        <li><a href="index.jsp?pages=<%=back%>">Back &laquo;</a></li>
                            <%if (pages - 1 > 2) {%>
                        <li><a href="index.jsp?pages=1">1</a></li>
                        <li><a href="#">...</a></li>

                        <%}
                            if (pages - 1 > 1) {%>
                        <li><a href="index.jsp?pages=<%=pages - 2%>" ><%=pages - 2%></a> </li>
                            <%}
                                if (pages - 1 > 0) {%>
                        <li><a href="index.jsp?pages=<%=pages - 1%>"><%=pages - 1%></a> </li>
                            <%}%>
                        <li><a href="index.jsp?pages=<%=pages%>"><%=pages%></a></li>
                            <% if (lastPage - pages > 0) {%>
                        <li><a href="index.jsp?pages=<%=pages + 1%>"><%=pages + 1%></a></li>
                            <%}
                                if (lastPage - pages > 1) {%>
                        <li><a href="index.jsp?pages=<%=pages + 2%>"><%=pages + 2%></a></li>
                            <%}
                                if (lastPage - pages > 2) {%>
                        <li><a href="#">...</a></li>
                        <li><a href="index.jsp?pages=<%=lastPage%>"><%=lastPage%></a></li>
                            <%}%>
                            <%
                                int next = pages;
                                if (pages == lastPage || pages == lastPage - 1) {
                                    next = lastPage;
                                } else {
                                    next = pages + 1;
                                }
                            %>
                        <li><a href="index.jsp?pages=<%=next%>"> &raquo; Next</a></li>
                        </li>

                    </ul>
                </div>


                <!-- show data from DB-->
                <table class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th>
                                Mã
                            </th>
                            <th>
                                Số tiền
                            </th>
                            <th>
                                Nội dung
                            </th>
                            <th>
                                Ngày tạo
                            </th>

                            <th>
                                Tình trạng
                            </th>
                            <th>
                                IpAddr
                            </th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int i = 0;
                            while (rs.next()) {
                        %>
                        <tr>

                            <td>
                                <%= rs.getInt(1)%>                   
                            </td>
                            <td>
                                <%= rs.getInt(2)%>
                            </td>
                            <td>
                                <%= rs.getString(3)%>
                            </td>
                            <td class="center">
                                <%=rs.getDate(4)%> 
                                <%= rs.getTime(6)%>
                            </td>


                            <td class="center">
                                <span class="pay-unsuccess">
                                    <%=rs.getString(5)%>
                                </span>
                            </td>
                            <td>
                                127.0.0.1
                            </td>
                            <td>

                                <form >
                                    <a href="Detail?pages=<%=pages%>&id=<%=i%>"  >Chi tiết</a>
                                    <input type="hidden" name="id" value="<%= rs.getInt(1)%>">
                                </form>
                            </td>

                            <%
                                    i++;
                                }
                            %>

                        </tr>
                    </tbody>
                </table>


                <!--bottom pagination-->  
                <div class="pager">
                    <ul class="pagination"> 

                        <li><a href="index.jsp?pages=<%=back%>">Back &laquo;</a></li>
                            <%if (pages - 1 > 2) {%>
                        <li><a href="index.jsp?pages=1">1</a></li>
                        <li><a href="">...</a></li>

                        <%}
                            if (pages - 1 > 1) {%>
                        <li><a href="index.jsp?pages=<%=pages - 2%>" ><%=pages - 2%></a> </li>
                            <%}
                                if (pages - 1 > 0) {%>
                        <li><a href="index.jsp?pages=<%=pages - 1%>"><%=pages - 1%></a> </li>
                            <%}%>
                        <li><a href="index.jsp?pages=<%=pages%>"><%=pages%></a></li>
                            <% if (lastPage - pages > 1) {%>
                        <li><a href="index.jsp?pages=<%=pages + 1%>"><%=pages + 1%></a></li>
                            <%}
                                if (lastPage - pages > 2) {%>
                        <li><a href="index.jsp?pages=<%=pages + 2%>"><%=pages + 2%></a></li>
                            <%}
                                if (lastPage - pages > 3) {%>
                        <li><a href="">...</a></li>
                        <li><a href="index.jsp?pages=<%=lastPage%>"><%=lastPage%></a></li>
                            <%}%>
                            <%

                                if (pages == lastPage || pages == lastPage - 1) {
                                    next = lastPage;
                                } else {
                                    next = pages + 1;
                                }
                            %>
                        <li><a href="index.jsp?pages=<%=next%>"> &raquo; Next</a></li>
                        </li>

                    </ul>
                </div>
            </div>

            <footer class="footer">
                <p>&copy; VNPAY 2018</p>
            </footer>
        </div> <!-- /container -->
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="Styles/js/ie10-viewport-bug-workaround.js"></script>

        <script>

        </script>
    </body>

    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:24 GMT -->
</html>

