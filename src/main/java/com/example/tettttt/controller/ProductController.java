package com.example.tettttt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tettttt.service.ProductService;

import antlr.collections.List;

@Controller

public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("user/list")
	public String list() {
		List<Product> list = productService.findAll();
		return "product/list";
	}
	@RequestMapping("user/detail/{id}")
	public String detail() {
		return "product/detail";
	}
}
