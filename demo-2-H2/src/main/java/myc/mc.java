package myc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import MyDD.DD;
import pojo.emp;

@Controller
public class mc {
@Autowired
DD dd;
	
@RequestMapping("index")
public ModelAndView CallLandingPage()
{
	ModelAndView mv = new ModelAndView();
	mv.setViewName("index");
    return mv;
}
@RequestMapping("insertemp")
public ModelAndView CallLandingPage1()
{
	ModelAndView mv = new ModelAndView();
	mv.setViewName("InsertEmp");
    return mv;
}
@RequestMapping("insertemp")
public ModelAndView CallLandingPage3(emp e)
{
	ModelAndView mv = new ModelAndView();
	dd.save(e);
	mv.addObject("msg","ADDED");
	mv.setViewName("insertEmp");
	return mv;
}
}
