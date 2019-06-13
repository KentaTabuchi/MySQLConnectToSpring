package com.kenta.tabuchi.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Autowired
    private JdbcTemplate jdbc;
	@RequestMapping(value= "/",method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mav) {
		mav.setViewName("index");
        List<Map<String, Object>> list = this.jdbc.queryForList("SELECT * FROM M_student");
        list.forEach(System.out::println);
        mav.addObject("msg",list.get(1));
		return mav;
		
	}
}
