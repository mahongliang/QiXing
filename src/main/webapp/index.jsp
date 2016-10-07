<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录页面</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/login.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/login.js"></script>
<style type="text/css">
body{
	background-image: url(<%=request.getContextPath()%>/resources/image/22.jpg);
  	background-color: #000000;
  	background-size: cover;
}
</style>
</head>
<body>

<div id="content">
	<h1>七星电容器数据与生产云管理服务系统</h1>
</div>
<div id="login">
	<p>管理员帐号：<input type="text" id="username" class="textbox"></p>
	<p>管理员密码：<input type="password" id="password" class="textbox"></p>
</div>

<div id="btn">
	<a href="#" class="easyui-linkbutton">登录</a>
</div>

</body>

</html>