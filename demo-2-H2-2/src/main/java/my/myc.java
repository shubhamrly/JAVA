package my;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myc {
@RequestMapping("Index")
public ModelAndView callLandingPage()
{
	ModelAndView mv=new ModelAndView();
    mv.setViewName("index");
    return mv;
}
}
