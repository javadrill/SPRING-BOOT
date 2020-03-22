package in.tecmentor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tecmentor.entity.ProductEntity;
import in.tecmentor.model.Product;
import in.tecmentor.repository.ProductRepository;
import in.tecmentor.service.ProductService;

/**
 * The Class ProductServiceImpl.
 */
@Service
public class ProductServiceImpl implements ProductService {

	/** The product repository. */
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		productRepository.save(productEntity);
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		List<ProductEntity> productEntities = productRepository.findAll();
		Product product = null;
		for (ProductEntity productEntity : productEntities) {
			product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			products.add(product);
		}
		return products;
	}

	@Override
	public void deleteProductById(Long productId) {
		productRepository.deleteById(productId);
	}

}
