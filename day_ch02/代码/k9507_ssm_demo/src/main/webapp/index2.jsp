<%@ page language="java"  contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script language="JavaScript" src="js/jquery-1.8.3.min.js"></script>
    <script language="JavaScript">
        //jquery代码一般写在加载事件
        $(function(){  //jquery的加载事件
          //给按钮添加点击事件
            $("#but1").click(function(){
                //alert("我要从服务器拿数据");
                //使用ajax技发送异步请求到服务器(控制器)获取数据
                //使用jquery封装的ajax方法发送异步请求
                //1.使用ajax方法发送异步请求
          /*      $.ajax({
                    type: "POST", //指定请求方式
                    url: "getStudentData",  //服务器地址
                    //data: "name=John&location=Boston",  //给服务器传参
                    success: function(data){  //成功返回
                        //data就表示服务器返回的数据
                        //js的dom操作
                        var table="<table border=2>";
                        table=table+"<tr><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>地址</td></tr>";
                        for(var i=0;i<data.length;i++){
                            var s=data[i];
                            table=table+"<tr><td>"+s.xh+"</td><td>"+s.name+"</td><td>"+s.age+"</td><td>"+s.sex+"</td><td>"+s.address+"</td></tr>";
                        }
                        table=table+"</table>";
                        $("#show").html(table);  //显示表格
                    }
                });*/

                //2.使用post或者get方法发送异步请求
                 //$.post("服务地址",传递给服务器的参数,回调函数,"服务返回的数据格式:json");
                $.post("getStudentData",null,function(data){
                    //js的dom操作
                    var table="<table border=2>";
                    table=table+"<tr><td>学号</td><td>姓名</td><td>年龄</td><td>性别</td><td>地址</td></tr>";
                    for(var i=0;i<data.length;i++){
                        var s=data[i];
                        table=table+"<tr><td>"+s.xh+"</td><td>"+s.name+"</td><td>"+s.age+"</td><td>"+s.sex+"</td><td>"+s.address+" 删除</td></tr>";
                    }
                    table=table+"</table>";
                    $("#show").html(table);  //显示表格
                },"json");


            });



        });

    </script>
</head>
<body>
<input type="button" id="but1" value="显示学生">
<div id="show"></div>

</body>
</html>
