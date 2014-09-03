package com.icss.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("12");
		return null;
	}

//	protected ModelAndView onSubmit(Object command, BindException errors)
//			throws Exception {
//		 LoginForm loginForm = (LoginForm) command;  
//	        if (loginForm.getUserName().equals("test")  
//	                && loginForm.getPassword().equals("test")) {  
//	            return new ModelAndView(getSuccessView(), "welcomeuser", loginForm  
//	                    .getUserName());  
//	        } else {  
//	            errors.reject("ccc", "用户名或密码有误！");  
//	            errors.rejectValue("userName", "nameErr", null, "用户名错误");  
//	            errors.rejectValue("password", "passErr", null, "密码错误");  
//	            return new ModelAndView(getFormView(), errors.getModel());  
//	        }  
//	}

}
