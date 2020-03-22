package in.tecmentor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.tecmentor.model.CustomResponse;
import in.tecmentor.model.Message;
import in.tecmentor.model.Product;
import in.tecmentor.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/save-product")
	public ResponseEntity<CustomResponse> saveProduct(@RequestBody Product product) {
		ResponseEntity<CustomResponse> responseEntity = null;
		CustomResponse customResponse = null;
		productService.saveProduct(product);
		customResponse = new CustomResponse("SUCCESS",
				new Message("PRODUCT_SUCCESS_001", "Product saved successfully."));
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping(value = "/update-product")
	public ResponseEntity<CustomResponse> updateProduct(@RequestBody Product product) {
		ResponseEntity<CustomResponse> responseEntity = null;
		CustomResponse customResponse = null;
		productService.saveProduct(product);
		customResponse = new CustomResponse("SUCCESS",
				new Message("PRODUCT_SUCCESS_002", "Product updated successfully."));
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	@GetMapping(value = "/all-products")
	public ResponseEntity<CustomResponse> getAllProducts() {
		ResponseEntity<CustomResponse> responseEntity = null;
		CustomResponse customResponse = null;
		List<Product> products = productService.getAllProducts();
		if (products.isEmpty()) {
			customResponse = new CustomResponse("SUCCESS", new Message("PRODUCT_SUCCESS_003", "No record found."));
		} else {
			customResponse = new CustomResponse("SUCCESS", products);
		}
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}

	/**
	 * Delete product by id.
	 *
	 * @param productId
	 *            the product id
	 * @return the response entity
	 */
	@GetMapping(value = "/delete-product-by-id")
	public ResponseEntity<CustomResponse> deleteProductById(@RequestParam Long productId) {
		ResponseEntity<CustomResponse> responseEntity = null;
		productService.deleteProductById(productId);
		CustomResponse customResponse = new CustomResponse("SUCCESS",
				new Message("PRODUCT_SUCCESS_004", "Product successfully deleted."));
		responseEntity = new ResponseEntity<CustomResponse>(customResponse, HttpStatus.OK);
		return responseEntity;
	}
}
