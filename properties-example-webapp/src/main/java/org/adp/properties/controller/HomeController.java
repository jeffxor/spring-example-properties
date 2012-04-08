package org.adp.properties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@Value("${environment.property.1}")
//	@Autowired
//	@Qualifier(value="string1")
	private String test1;
	
	@Value("${environment.property.2}")
//	@Autowired
//	@Qualifier(value="string2")
	private String test2;

	@RequestMapping("/test")
	public String testProperties(ModelMap modelMap){
		modelMap.addAttribute("test1", test1);
		modelMap.addAttribute("test2", test2);
		return "test";
	}
}
