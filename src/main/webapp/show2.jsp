<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<p></p>
	</div>
	<a href="/QiXing/">返回主页</a>
	<h1>卷绕机实时监控页</h1>
	<h3>当前时间： ${time}</h3>

	<table width="80%" border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<c:forEach items="${arrayList1}" var="item">
					<th>${item}</th>
				</c:forEach>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${machines}" var="item">
				<tr>
					<td align="center">${item.getMachineId()}</td>
					<td align="center">${item.getCtype()}</td>
					<td align="center">${item.getEmployeeName()}</td>
					<td align="center">${item.getCardId()}</td>
					<td align="center">${item.getMahicneOutput()}</td>
					<td align="center">${item.getRunTime()}</td>
					<td align="center">${item.getIdleTime()}</td>
					<td align="center">${item.getErrorTime()}</td>
					<td align="center">${item.getRecordTime()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${curPage == 1}">
		<a>首页</a>
		<a>上一页</a>
	</c:if>

	<c:if test="${curPage != 1}">
		<a href="listWinding?curPage=1">首页</a>
		<a href="listWinding?curPage=${curPage - 1}">上一页</a>
	</c:if>

	<c:if test="${curPage == totalPage}">
		<a>下一页</a>
		<a>尾页</a>
	</c:if>

	<c:if test="${curPage != totalPage}">
		<a href="listWinding?curPage=${curPage + 1}">下一页</a>
		<a href="listWinding?curPage=${totalPage}">尾页</a>
	</c:if>

	<p>当前第${curPage}页 总共${totalPage}页</p>
</body>
</html>