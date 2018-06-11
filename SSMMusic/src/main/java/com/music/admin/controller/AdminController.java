package com.music.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	
	   //������ҳ����ʾ�ķ���
		@RequestMapping(value="/index")
		public ModelAndView index(HttpServletResponse response,HttpServletRequest request){
			response.setCharacterEncoding("utf-8");
			
			ModelAndView view = new ModelAndView("admin/index");
			
			return view;
		}
		 //������ʾ��¼����ķ���
		@RequestMapping(value="/login")
		public ModelAndView login(HttpServletResponse response,HttpServletRequest request){
			response.setCharacterEncoding("utf-8");
			
			
			
			ModelAndView view = new ModelAndView("admin_login");
			
			return view;
		}
		
}
