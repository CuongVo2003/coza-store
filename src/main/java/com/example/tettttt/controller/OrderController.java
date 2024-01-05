package com.example.tettttt.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class OrderController {
	@RequestMapping("user/checkout")
	public String checkout() {
		return "order/checkout";
	}
	@RequestMapping("user/list-order")
	public String list() {
		return "order/list-order";
	}
	@RequestMapping("user/detail-order/{id}")
	public String detail() {
		return "order/detail-order";
	}
}
