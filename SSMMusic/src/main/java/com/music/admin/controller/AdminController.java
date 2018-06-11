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

	
	   //用于主页面显示的方法
		@RequestMapping(value="/index")
		public ModelAndView index(HttpServletResponse response,HttpServletRequest request){
			response.setCharacterEncoding("utf-8");
			
			ModelAndView view = new ModelAndView("admin/index");
			
			return view;
		}
		 //用于显示登录界面的方法
		@RequestMapping(value="/login")
		public ModelAndView login(HttpServletResponse response,HttpServletRequest request){
			response.setCharacterEncoding("utf-8");
			
			
			
			ModelAndView view = new ModelAndView("admin_login");
			
			return view;
		}
		
}
