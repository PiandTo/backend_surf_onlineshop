package ru.school21.backend_surf_onlineshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.school21.backend_surf_onlineshop.models.Product;
import ru.school21.backend_surf_onlineshop.service.ProductService;

import java.util.HashMap;

@Controller
@AllArgsConstructor
public class ProductController {
	private final ProductService productService;

	@GetMapping("/")
	public String index(Model model) {
		HashMap<String, Iterable<Product>> map = productService.findAll();
		model.addAttribute("map", map);
		return "index";
	}

	@GetMapping("/product")
	public String howProduct(@RequestParam("id") long id,
							 Model model) {
		Product product = productService.findById(id);
		if (product == null) {
			return null;
		}
		model.addAttribute("product", product);
		return "product";
	}
}
