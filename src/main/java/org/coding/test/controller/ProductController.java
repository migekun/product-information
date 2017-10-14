package org.coding.test.controller;

import org.coding.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(path="/")
	public String initProductsList(Model model) {
		model.addAttribute("products", productService.getProducts());
		return "productsList";
	}
	
}
