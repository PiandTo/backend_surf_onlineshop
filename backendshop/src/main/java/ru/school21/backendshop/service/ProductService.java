package ru.school21.backendshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.school21.backendshop.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;

}
