package com.sebastian.bogado.campiste.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
	@GetMapping
	public String redirectToSwagger() {
		return "redirect:swagger-ui.html";
	}
}
