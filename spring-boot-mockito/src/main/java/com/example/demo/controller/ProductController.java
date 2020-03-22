package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productServiceImpl;

	@GetMapping(value = "/product-list")
	public List<Product> getProducts() {
		System.out.println("Inside controller method- getProducts");
		return productServiceImpl.getProducts();
	}

}
