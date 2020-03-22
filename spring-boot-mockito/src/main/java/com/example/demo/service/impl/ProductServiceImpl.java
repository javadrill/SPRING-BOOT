package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {

		System.out.println("Inside service method- getProducts");
		 
		if(true) {
			return null;
		}
		

		return null;
	}

}
