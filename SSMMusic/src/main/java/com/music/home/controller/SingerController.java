package com.music.home.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/singer")
public class SingerController {

	   //用于显示歌手搜索界面
		@RequestMapping(value="/index")
		public ModelAndView index(HttpServletResponse response,HttpServletRequest request){
			response.setCharacterEncoding("utf-8");
			
			ModelAndView view = new ModelAndView("home/user_search_singer");
			
			return view;
		}
}
