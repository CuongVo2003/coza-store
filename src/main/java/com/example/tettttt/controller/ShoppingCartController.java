package com.example.tettttt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
	
	
	@RequestMapping("user/cart")
	public String view() {
		return "shop/cart";
	}
}
