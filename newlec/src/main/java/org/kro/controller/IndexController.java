package org.kro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(this.getClass().getName());
		System.out.println("KERORO");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello Spring Mvc~");
		mv.setViewName("index");
		return mv;
	}

}
