<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>银行存款日记账－登录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/smoothness/jquery-ui.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/smoothness/theme.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
</head>
<body>
<h1>银行存款日记账</h1>
<div id="login">
    <form id="loginForm" action="${pageContext.request.contextPath }/servlet/LoginServlet" method="post">
	<p>用户姓名：<input type="text" id="user" name="name" class="textbox"></input>
	<p>用户密码：<input type="password" id="password" name="password" class="textbox"></input>
    </form>
</div>
<div id="btn">
    <a href="#" class="easyui-linkbutton">登录</a>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>
</html>
