package com.music.home.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/user")
public class UserController {

	    //��������ʾ
		@RequestMapping(value="/index")
		public ModelAndView index(HttpServletResponse response){
			response.setCharacterEncoding("utf-8");
			
			ModelAndView modelAndView = new ModelAndView("home/index");		
			return modelAndView;
		}
		//�û���¼������ʾ
		@RequestMapping(value="/login")
		public ModelAndView show_login(HttpServletResponse response){
			response.setCharacterEncoding("utf-8");
			
			ModelAndView modelAndView = new ModelAndView("user_login");		
			return modelAndView;
		}
		//�û���¼������ʾ
	    @RequestMapping(value="/regist")
	    public ModelAndView show_regist(HttpServletResponse response){
			response.setCharacterEncoding("utf-8");
					
			ModelAndView modelAndView = new ModelAndView("home/user_regist");		
			return modelAndView;
		}
}
