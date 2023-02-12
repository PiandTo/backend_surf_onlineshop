package ru.school21.backend_surf_onlineshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.school21.backend_surf_onlineshop.models.Product;
import ru.school21.backend_surf_onlineshop.models.ProductType;
import ru.school21.backend_surf_onlineshop.repository.ProductRepository;

import java.util.HashMap;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;

	public HashMap<String, Iterable<Product>> findAll() {
		HashMap<String, Iterable<Product>> list = new HashMap<>();
		for (ProductType p : ProductType.values()) {
			list.put(p.name(), productRepository.findByType(p));
		}
		return list;
	}

	public Iterable<Product> findByType (ProductType type){
		return productRepository.findByType(type);
	}

	public Product findById(long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			return product.get();
		} else {
			return null;
		}
	}
}
