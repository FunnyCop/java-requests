package com.logan.requests.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.ui.Model;
//import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@RequestMapping( "/" )
	public String index() { return "index.jsp"; }
	
	@RequestMapping( value = "/submit", method = RequestMethod.POST )
	public String submit( @RequestParam( value = "code" ) String code, RedirectAttributes redirectAttributes ) {
		if ( code.equals( "bushido" ) ) { return "redirect:/success"; }
		redirectAttributes.addFlashAttribute( "error", "Invalid Code" );
		return "redirect:/";
	}
	
	@RequestMapping( "/success" )
	public String success() { return "success.jsp"; }

}
