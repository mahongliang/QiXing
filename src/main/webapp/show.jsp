<%@page import="com.mahl.pojo.SelectMachine"%>

<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setIntHeader("Refresh", 5);

		List<SelectMachine> machines = (List<SelectMachine>) request.getAttribute("machines");

		for (SelectMachine selectMachine : machines) {
			out.print(selectMachine.getMachineId() + " ");

			out.print(selectMachine.getEmployeeName() + " ");
			out.print(selectMachine.getMachineState() + " ");

			out.print(selectMachine.getFirstGrade() + " ");
			out.print(selectMachine.getSecondGrade() + " ");
			out.print(selectMachine.getThirdGrade() + " ");

			out.print(selectMachine.getRunTime() + " ");
			out.print(selectMachine.getErrorTime() + " ");
			out.print(selectMachine.getIdleTime() + " ");
			out.print(selectMachine.getRecordTime());

			out.print("</br>");

		}

		// 获取当前时间
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;
		out.println("当前时间为: " + CT + "\n");
	%>
</body>
</html>