package in.tecmentor.service;

import java.util.List;

import in.tecmentor.model.Product;

/**
 * The Interface ProductService.
 */
/**
 * @author rup
 *
 */
/**
 * @author rup
 *
 */
public interface ProductService {

	/**
	 * Save product.
	 *
	 * @param product
	 *            the product
	 */
	public void saveProduct(Product product);

	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	public List<Product> getAllProducts();

	/**
	 * Delete product by id.
	 *
	 * @param productId
	 *            the product id
	 */
	public void deleteProductById(Long productId);

}
