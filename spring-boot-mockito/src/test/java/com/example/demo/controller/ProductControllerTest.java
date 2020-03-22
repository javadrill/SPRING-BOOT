package com.example.demo.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.dto.Product;
import com.example.demo.service.impl.ProductServiceImpl;

/**
 * The Class ProductControllerTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

	/** The product controller. */
	@InjectMocks
	private ProductController productController;

	/** The product service impl. */
	@Mock
	private ProductServiceImpl productServiceImpl;

	/**
	 * Test.
	 */
	@Test
	public void getProductsTest() {
		
		// Give
		List<Product> products = new ArrayList<>();
		products.add(new Product(100L, "Mouse", 150d));
		products.add(new Product(101L, "Keyboard", 550d));

		// When // then
		when(productServiceImpl.getProducts()).thenReturn(products);

		// Assert test
		List<Product> products2 = productController.getProducts();
		assertEquals(2, products2.size());
		verify(productServiceImpl, times(1)).getProducts();
	}

}
