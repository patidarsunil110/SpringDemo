package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.HomeDTO;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public ModelAndView showHome(@ModelAttribute("home") HomeDTO homeDTO)
	{
		return new ModelAndView("home");
	}

}
