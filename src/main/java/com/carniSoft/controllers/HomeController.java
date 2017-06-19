package com.carniSoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public ModelAndView home(){
		
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
	
	@GetMapping("/painelControle")
	public ModelAndView painelControle(){
		
		ModelAndView mv = new ModelAndView("pages/painelControle");
		
		return mv;
	}
	
	
	@GetMapping("/login")
	public ModelAndView login(){
		
		ModelAndView mv = new ModelAndView("login");
		
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView logar(){
		
		ModelAndView mv = new ModelAndView("pages/painelControle");
		
		return mv;
	}
	
	@GetMapping("/tanques")
	public ModelAndView tanques(){
		
		ModelAndView mv = new ModelAndView("pages/tanques");
		
		return mv;
	}
	@GetMapping("/lotes")
	public ModelAndView lotes(){
		
		ModelAndView mv = new ModelAndView("pages/lotes");
		
		return mv;
	}
	@GetMapping("/camaroes")
	public ModelAndView camaroes(){
		
		ModelAndView mv = new ModelAndView("pages/camaroes");
		
		return mv;
	}
	@GetMapping("/alimetacaoLimpeza")
	public ModelAndView alimetacaoLimpeza(){
		
		ModelAndView mv = new ModelAndView("pages/limpezaalimentacao");
		
		return mv;
	}
}
