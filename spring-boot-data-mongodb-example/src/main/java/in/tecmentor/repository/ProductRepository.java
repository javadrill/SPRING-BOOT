package in.tecmentor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.tecmentor.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, Long> {

}
