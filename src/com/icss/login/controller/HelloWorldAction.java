package com.icss.login.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldAction implements Controller{

	 private String helloWorld;      //���������ڻ�ȡ�����ļ��е�helloWorld����
	 private String viewPage;        //���ڻ�ȡ�����ļ��е�viewPage����
	 public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException {//�ڸ÷����д����û�����
        Map model = new HashMap();
        model.put("helloWorld", getHelloWorld());       //��helloWorld���Դ� ��model��
        request.getSession().setAttribute("12", "34");
        return new ModelAndView(getViewPage(),model);   //����getViewPage�� ȡҪ���ص�ҳ��
	 }
    public void setViewPage(String viewPage){
        this.viewPage = viewPage;
    }
    public String getViewPage(){
        return this.viewPage;
    }
    public void setHelloWorld(String helloWorld){
        this.helloWorld = helloWorld;
    }
    public String getHelloWorld(){
        return this.helloWorld;
    }
}
