package com.mahl.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahl.form.BaomoMachineForm;
import com.mahl.form.SelectMachineForm;
import com.mahl.form.WindingMachineForm;
import com.mahl.pojo.BaomoMachine;
import com.mahl.pojo.SelectMachine;
import com.mahl.pojo.WindingMachine;
import com.mahl.serviceimpl.UserActionImpl;
import com.mahl.util.ConvertToForm;
import com.mahl.util.PageControl;

@Controller
public class MachineController {

	@Autowired
	private UserActionImpl userAction;

	@RequestMapping(value = "/listSelect", method = RequestMethod.GET)
	public String showSelectMachine(HttpServletRequest request, HttpServletResponse response) {

		response.setIntHeader("Refresh", 5);

		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("机器号");
		arrayList1.add("操作员工");
		arrayList1.add("一等品");
		arrayList1.add("二等品");
		arrayList1.add("三等品");

		arrayList1.add("运行时间");
		arrayList1.add("空闲时间");
		arrayList1.add("故障时间");
		arrayList1.add("记录时间");

		request.setAttribute("arrayList1", arrayList1);

		List<SelectMachine> machines = userAction.getSelectMachines();
		int page_record = 20;
		String curPage = request.getParameter("curPage");
		if (curPage == null) {
			curPage = 1 + "";
		}

		int totalPage = PageControl.getTotal_Pages(machines.size(), page_record);

		machines = PageControl.getList(machines, Integer.valueOf(curPage), page_record);

		List<SelectMachineForm> forms = ConvertToForm.getSelectMachineForm(machines);

		request.setAttribute("curPage", curPage);

		request.setAttribute("totalPage", totalPage);

		request.setAttribute("machines", forms);

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

		request.setAttribute("time", CT);

		return "show1";
	}

	@RequestMapping(value = "/listWinding", method = RequestMethod.GET)
	public String showWindingMachine(HttpServletRequest request, HttpServletResponse response) {

		response.setIntHeader("Refresh", 5);

		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("机器号");
		arrayList1.add("类型");
		arrayList1.add("操作员工");

		arrayList1.add("卡号");
		arrayList1.add("当前产量");

		arrayList1.add("运行时间");
		arrayList1.add("空闲时间");
		arrayList1.add("故障时间");
		arrayList1.add("记录时间");
		request.setAttribute("arrayList1", arrayList1);

		List<WindingMachine> machines = userAction.getWindingMachines();
		int page_record = 20;

		// String pageSize = request.getParameter("department");
		//
		// List<String> pageSizes = new ArrayList<>();
		// pageSizes.add("10");
		// pageSizes.add("20");
		// pageSizes.add("30");

		String curPage = request.getParameter("curPage");
		if (curPage == null) {
			curPage = 1 + "";
		}

		int totalPage = PageControl.getTotal_Pages(machines.size(), page_record);

		machines = PageControl.getList(machines, Integer.valueOf(curPage), page_record);

		List<WindingMachineForm> forms = ConvertToForm.getWindingMachineForm(machines);

		request.setAttribute("curPage", curPage);

		// request.setAttribute("pageSizes", pageSizes);

		request.setAttribute("selectedPageSize", "20");

		request.setAttribute("totalPage", totalPage);
		request.setAttribute("machines", forms);

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

		request.setAttribute("time", CT);

		return "show2";
	}

	@RequestMapping(value = "/listBaomo", method = RequestMethod.GET)
	public String showBaomoMachine(HttpServletRequest request, HttpServletResponse response) {

		response.setIntHeader("Refresh", 5);

		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("机器号");
		arrayList1.add("操作员工");
		arrayList1.add("卡号");
		arrayList1.add("当前产量");
		arrayList1.add("运行时间");
		arrayList1.add("空闲时间");
		arrayList1.add("故障时间");
		arrayList1.add("记录时间");
		request.setAttribute("arrayList1", arrayList1);

		List<BaomoMachine> machines = userAction.getBaomoMachines();
		int page_record = 20;

		String curPage = request.getParameter("curPage");
		if (curPage == null) {
			curPage = 1 + "";
		}

		int totalPage = PageControl.getTotal_Pages(machines.size(), page_record);

		machines = PageControl.getList(machines, Integer.valueOf(curPage), page_record);

		List<BaomoMachineForm> forms = ConvertToForm.getBaomoMachineForm(machines);

		request.setAttribute("curPage", curPage);

		request.setAttribute("selectedPageSize", "20");

		request.setAttribute("totalPage", totalPage);
		request.setAttribute("machines", forms);

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

		request.setAttribute("time", CT);

		return "show3";
	}
}
