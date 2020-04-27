<%--
  Created by IntelliJ IDEA.
  User: lengbing
  Date: 2020/4/21
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>冷冰科技</title>
        <link rel=stylesheet href="${pageContext.request.contextPath}/statics/css/heweizhuang.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.3.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/heweizhuang.js"></script>
        <script type="text/javascript">
            $(function () {
                $("#btn_user_all").click(function () {
                    $.post("${pageContext.request.contextPath}/user/selectUserAll", function (data) {
                        console.log(data);
                        let html = "";
                        for (let i = 0; i < data.length; i++) {
                            html += "<tr>" +
                                "<td>"+ data[i].userid + "</td>" +
                                "<td>"+ data[i].username + "</td>" +
                                "<td>"+ data[i].userage + "</td>" +
                                "<tr>"
                        }
                        $("#content_user_all").html(html);
                    });
                });
            });

        </script>
    </head>
    <body>
        <h1>欢迎来到冷冰科技</h1>
        <a href="addUser" title="">登录</a>

        <hr/>

        <div id="div_user_all">
            <input type="button" id="btn_user_all" value="获取全部用户信息">
            <table id="table_user_all">
                <thead>
                    <tr>
                        <td>用户编号</td> <td>用户名称</td> <td>用户年龄</td>
                    </tr>
                </thead>
                <tbody  id="content_user_all">

                </tbody>
            </table>
        </div>

    </body>
</html>
