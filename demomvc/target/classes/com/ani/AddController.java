package com.ani;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
@Component
@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(res.getParameter("t2"));
		int k= i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setView("Display.jsp);"
		mv.addObject("result",k);
		return mv;
	}

}
