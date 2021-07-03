package com.app.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping("home")
//	public String home(HttpServletRequest req, HttpServletResponse res)
//	{
//		HttpSession session = req.getSession();
//		String data = req.getParameter("data");
//		session.setAttribute("data", data);
//		System.out.println("hello world...." + data);
//		return "home";
//	}

	
//	@RequestMapping("home")
//	public String home(String data,HttpSession session)
//	{
//		
//		session.setAttribute("data", data);
//		System.out.println("hello world...." + data);
//		return "home";
//	}

//	@RequestMapping("home")
//	public ModelAndView home(String data)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("data", data);
//		mv.setViewName("home");		
//		return mv;
//	}
//	

	@RequestMapping("home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("home");		
		return mv;
	}
	
	
}
