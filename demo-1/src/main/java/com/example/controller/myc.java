package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class myc {
@RequestMapping("index")
  public ModelAndView callLandingPage()
  {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("index");
	return mv;
  }
@RequestMapping("welcome")
public ModelAndView sayWelcome()
{
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	return mv;
}}
