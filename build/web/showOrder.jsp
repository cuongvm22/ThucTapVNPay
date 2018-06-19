<%-- 
    Document   : showOrder
    Created on : Jun 19, 2018, 10:21:27 AM
    Author     : cuongvm
--%>

<%@page import="java.util.List"%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/jumbotron-narrow.css" rel="stylesheet">
     

    </head>
    <body>
        <%            
            
            int pages = 1;
            int lastPage = 10;
            
            if (request.getParameter("pages")!= null)
                pages = Integer.parseInt(request.getParameter("pages"));
            
                
        %>
        <div class="table-responsive">
            <ul class="pagination"> 

                <%               
                    int back = 0;
                    if (pages == 0 || pages == 1) {
                        back = 1;
                    } else {
                        back = pages - 1;
                    }
                %>
                <li><a href="Forward" >Back &laquo;</a></li>
                    <%if (pages - 1 > 2) {%>
                <li><a href="">...</a></li>
                    <%}
                        if (pages - 1 > 1) {%>
                <li><a href="Forward" ><%=pages - 2%></a> </li>
                    <%}
                        if (pages - 1 > 0) {%>
                <li><a href="showOrder.jsp?pages=<%=pages - 1%>"><%=pages - 1%></a> </li>
                    <%}%>
                <li><a href="showOrder.jsp?pages=<%=pages%>"><%=pages%></a></li>
                    <% if (lastPage - pages > 1) {%>
                <li><a href="showOrder.jsp?pages=<%=pages + 1%>"><%=pages + 1%></a></li>
                    <%}
                        if (lastPage - pages > 2) {%>
                <li><a href="showOrder.jsp?pages=<%=pages + 2%>"><%=pages + 2%></a></li>
                    <%}
                        if (lastPage - pages > 3) {%>

                <li><a href="#">...</a></li>
                    <%}%>
                    <%
                        int next = lastPage;
                        if (pages != lastPage || pages != lastPage - 1) {
                            next = pages + 1;
                        }
                    %>
                <li><a href="showOrder.jsp?pages=<%=next%>"> &raquo; Next</a></li>
                </li>

            </ul>

            <%%>

         


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
                        {
                    %>
                    <tr>

                        <td>
                           
                        </td>
                        <td>
                          
                        </td>
                        <td>
                            
                        </td>
                        <td class="center">
                            
                        </td>


                        <td class="center">
                            <span class="pay-unsuccess">
                                
                            </span>
                        </td>
                        <td>
                            127.0.0.1
                        </td>
                        <td>
                            <a href="TestJava" method="post">Chi tiết</a>

                        </td>
                      
                        <%
                            }
                        %>

                    </tr>
                </tbody>
            </table>



            <div class="pager">
                Số trang- thinking;
            </div>
        </div>
    </body>
</html>
