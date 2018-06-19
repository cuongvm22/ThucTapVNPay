<%-- 
    Document   : newjsp1
    Created on : Jun 19, 2018, 4:47:22 PM
    Author     : cuongvm
--%>

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


            <h3>Chi tiết</h3>
            <div class="table-responsive">

                <div class="form-group">
                    <label for="OrderId">Mã đơn hàng</label>
                    <%=request.getAttribute("id")%>
                </div>
                <div class="form-group">
                    <label for="Amount">Số tiền</label>
                    <%=request.getAttribute("totalPrice")%>
                </div>
                <div class="form-group">
                    <label for="OrderDescription">Nội dung thanh toán</label>
                    <%=request.getAttribute("content")%>

                </div>
                <div class="form-group">
                    <label >Trạng thái</label>
                    <span class="pay-unsuccess">
                        <%=request.getAttribute("property")%>
                    </span>

                </div>
            </div>
            <p>
                <a href="https://sandbox.vnpayment.vn/tryitnow/">Về danh s&#225;ch</a>
            </p>

            <footer class="footer">
                <p>&copy; VNPAY 2018</p>
            </footer>

    </body>
</html>
