package com.kenta.tabuchi.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value= "/",method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
		
	}
}
