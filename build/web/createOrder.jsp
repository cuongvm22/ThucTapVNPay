<%-- 
    Document   : createOrder
    Created on : Jun 18, 2018, 8:53:41 AM
    Author     : cuongvm
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.sql.Time"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/Home/CreateOrder by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:25 GMT -->
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Tạo mới đơn h&#224;ng</title>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet"/>
        <!-- Custom styles for this template -->
        <link href="css/jumbotron-narrow.css" rel="stylesheet">
        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="/tryitnow/Styles/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="/js/ie-emulation-modes-warning.js"></script>
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    
        <![endif]-->
        <script src="js/jquery-1.12.4.min.js"></script>
    </head>

    <body>

        <div class="container">
            <div class="header clearfix">
                <nav>
                    <ul class="nav nav-pills pull-right">
                        <li role="presentation" ><a href="index.jsp">Danh sách</a></li>
                        <li role="presentation" class="active"><a href="createOrder.jsp">Tạo mới</a></li>


                    </ul>
                </nav>
                <h3 class="text-muted">VNPAY DEMO</h3>
            </div>

            <h3>Tạo mới đơn h&#224;ng</h3>
            <div class="table-responsive">
                <form action="CreateOrder" id="CreateOrder" method="post">        
                    <div class="form-group">
                       
                    </div>        
                    <div class="form-group">
                        <label for="Amount">Số tiền</label>
                        <input class="form-control" data-val="true" data-val-number="The field Amount must be a number." data-val-required="The Amount field is required." id="Amount" max="100000000" min="1" name="totalPrice" type="number" value="10000" />
                    </div>
                    <div class="form-group">
                        <label for="OrderDescription">Nội dung thanh toán</label>
                        <textarea class="form-control" cols="20" id="OrderDescription" name="content" rows="2"> Thanh toan don hang thoi gian: <%=new Date(System.currentTimeMillis())%> <%= new Time(System.currentTimeMillis())%></textarea>
                    </div>
                    <div class="form-group">
                        <label for="language">Tình trạng </label>
                        <select name="property" id="ordertype" class="form-control">
                            <option value="Da thanh toan" >Đã thanh toán</option>
                            <option value="Chua thanh toan">Chưa thanh toán</option>
                        </select>
                    </div>

                    <input type="submit" value="Thanh toán"/>
                    
                </form>
            </div>
            <p>
                &nbsp;
            </p>

            <footer class="footer">
                <p>&copy; VNPAY 2018</p>
            </footer>
        </div> <!-- /container -->
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../Styles/js/ie10-viewport-bug-workaround.js"></script>

        <link href="css/vnpay.css" rel="stylesheet" />
        <script src="css/vnpay.js"></script>  
        <script type="text/javascript">
            $("#btnPopup").click(function () {
                var postData = $("#frmCreateOrder").serialize();
                var submitUrl = $("#frmCreateOrder").attr("action");
                $.ajax({
                    type: "POST",
                    url: submitUrl,
                    data: postData,
                    dataType: 'JSON',
                    success: function (x) {
                        if (x.code === '00') {
                            if (window.vnpay)
                            {
                                vnpay.open({width: 768, height: 600, url: x.data});
                            } else
                            {
                                window.location = x.data;
                            }
                            return false;
                        } else {
                            alert("Error:" + x.Message);
                        }
                    }
                });
                return false;
            });
        </script>



    </body>

    <!-- Mirrored from sandbox.vnpayment.vn/tryitnow/Home/CreateOrder by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 18 Jun 2018 01:38:26 GMT -->
</html>

