package ru.school21.backend_surf_onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
