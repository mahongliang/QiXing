package com.mahl.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mahl.pojo.User;
import com.mahl.service.IUserManager;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private Logger logger = Logger.getLogger(AdminController.class);

	@Autowired
	private IUserManager userManager;
	
	@RequestMapping("/listwinding")
	public String getWindingPage(){
		return "windingmachine";
	}
	
	@RequestMapping("/listbaomo")
	public String getBaomoPage(){
		return "baomomachine";
	}
	
	@RequestMapping("/listselect")
	public String getSelectPage(){
		return "selectmachine";
	}
	
	@RequestMapping("/list")
	public String listMenu(){
		return "admin";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public int login(HttpServletRequest request,User user){
		logger.info("logining");
		if (userManager.checkUser(user)) {
			logger.info("登陆成功");
			request.getSession().setAttribute("user", user);
			return 2;
		}else {
			logger.info("登陆失败");
			return 0;
		}	
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		logger.info("logout");
		request.getSession().removeAttribute("user");
		return "redirect:/";
	}
}
